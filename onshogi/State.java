package onshogi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * 盤面の状況を表すStateクラス．
 * @author nisshy
 */
public class State extends Object implements Cloneable {
	
	public static void main(String[] arms) {
		State s = new State();
		System.out.println(s.toString());
	}
	
	public static final int SIZE = 9; 
	
	/**
	 * 盤面上の状態．
	 * 将棋の棋譜の表し方に合わせて，右上を「1一」とする座標系である．
	 * 1つ目の添字が筋(横方向)，2つ目の添字が段(縦方向)の位置を表す．
	 */
	private Piece[][] board = new Piece[SIZE+2][SIZE+2];
	
	/**
	 * 先手の持ち駒の数
	 */
	private LinkedHashMap<Piece, Integer> bleakCapturedPieces;
	
	/**
	 * 後手の持ち駒の数
	 */
	private LinkedHashMap<Piece, Integer> whiteCapturedPieces;
	
	/**
	 * 対局の初期状態に初期化された，インスタンスを生成する．
	 */
	public State() {
		this.init();
	}
	
	public State(Piece[][] board, HashMap<Piece, Integer> bleakCapturedPieces, HashMap<Piece, Integer> whiteCapturedPieces) {
		this.board = board.clone(); 
		this.bleakCapturedPieces = new LinkedHashMap<Piece, Integer>(bleakCapturedPieces);
		this.whiteCapturedPieces = new LinkedHashMap<Piece, Integer>(whiteCapturedPieces);
		
	}
	
	@Override
	public State clone() {
		try {
			return (State)super.clone();
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e.toString());
		}
		
	}
	
	/**
	 * 対局の初期状態に初期化する．
	 */
	public void init() {
		//持ち駒の初期化
		this.bleakCapturedPieces = new LinkedHashMap<Piece, Integer>();
		this.bleakCapturedPieces.put(new Fu(true), 0);
		this.bleakCapturedPieces.put(new Kyosha(true), 0);
		this.bleakCapturedPieces.put(new Keima(true), 0);
		this.bleakCapturedPieces.put(new Gin (true), 0);
		this.bleakCapturedPieces.put(new Kin(true), 0);
		this.bleakCapturedPieces.put(new Kaku(true), 0);
		this.bleakCapturedPieces.put(new Hisha(true), 0);
		this.whiteCapturedPieces = new LinkedHashMap<Piece, Integer>();
		this.whiteCapturedPieces.put(new Fu(false), 0);
		this.whiteCapturedPieces.put(new Kyosha(false), 0);
		this.whiteCapturedPieces.put(new Keima(false), 0);
		this.whiteCapturedPieces.put(new Gin(false), 0);
		this.whiteCapturedPieces.put(new Kin(false), 0);
		this.whiteCapturedPieces.put(new Kaku(false), 0);
		this.whiteCapturedPieces.put(new Hisha(false), 0);
		//盤面の初期化
		this.board[9][1] = new Kyosha(false);
		this.board[8][1] = new Keima(false);
		this.board[7][1] = new Gin(false);
		this.board[6][1] = new Kin(false);
		this.board[5][1] = new Ou(false);
		this.board[4][1] = new Kin(false);
		this.board[3][1] = new Gin(false);
		this.board[2][1] = new Keima(false);
		this.board[1][1] = new Kyosha(false);
		this.board[2][2] = new Kaku(false);
		this.board[8][2] = new Hisha(false);
		this.board[9][9] = new Kyosha(true);
		this.board[8][9] = new Keima(true);
		this.board[7][9] = new Gin(true);
		this.board[6][9] = new Kin(true);
		this.board[5][9] = new Ou(true);
		this.board[4][9] = new Kin(true);
		this.board[3][9] = new Gin(true);
		this.board[2][9] = new Keima(true);
		this.board[1][9] = new Kyosha(true);
		this.board[8][8] = new Kaku(true);
		this.board[2][8] = new Hisha(true);
		for(int i = 1; i < 10; i++) {
			this.board[i][3] = new Fu(false);
			this.board[i][7] = new Fu(true);
		}
		
	}

	/**
	 * 終了状態かを判定して応答する．
	 * @return 終了状態か否か．
	 */
	public boolean isEnd() {
		return false;
	}

	/**
	 * 今の状態に対して，指定された手が合法手かを判定して応答する．
	 * @param move 判定したい手．
	 * @return moveが合法手か否か．
	 */
	public boolean isLegalMove(Move move) {
		return false;
	}

	/**
	 * 手を適用して，状態を変化させる．
	 * @param move 適用する手．
	 */
	public void makeAMove(Move move) {
	}
	
	/**
	 * 持ち駒をStringにして返す.
	 * @param capturedPieces 文字列に変換したい持ち駒
	 * @return 持ち駒の文字列表現
	 */
	public String convertCapturedPieces(LinkedHashMap<Piece, Integer> capturedPieces) {
		StringBuilder builder = new StringBuilder();
		for(Map.Entry<Piece, Integer> entry: capturedPieces.entrySet()) {
			if(entry.getValue() >= 1)
				builder.append(entry.getKey().toString() + entry.getValue() + " ");
		}
		return builder.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("後手 持ち駒:");
		builder.append(convertCapturedPieces(whiteCapturedPieces));
		builder.append("\n");
		builder.append("  9   8   7   6   5   4   3   2   1\n");
		builder.append("+---+---+---+---+---+---+---+---+---+\n");
		for(int i = 1; i <= State.SIZE; i++) {
			builder.append("|");
			for(int j = State.SIZE ; j > 0; j--) {
				if(this.board[j][i] == null) 
					builder.append("   ");
				
				else
					builder.append(this.board[j][i]);
				builder.append("|");
			}
			builder.append(i+"\n");
			builder.append("+---+---+---+---+---+---+---+---+---+\n");
		}
		
		builder.append("先手 持ち駒:");
		builder.append(convertCapturedPieces(bleakCapturedPieces));
		return builder.toString();
	}
	
}
