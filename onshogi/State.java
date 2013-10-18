package onshogi;

import java.util.HashMap;

/**
 * 盤面の状況を表すStateクラス．
 * @author nisshy
 */
public class State extends Object implements Cloneable {
	public static final int SIZE = 11; 
	
	/**
	 * 盤面上の状態．
	 * 将棋の棋譜の表し方に合わせて，右上を「1一」とする座標系である．
	 * 1つ目の添字が筋(横方向)，2つ目の添字が段(縦方向)の位置を表す．
	 */
	private Piece[][] board = new Piece[SIZE][SIZE];
	
	/**
	 * 持ち駒の数
	 */
	private HashMap<Piece, Integer> capturedPieces;
	
	/**
	 * 対局の初期状態に初期化された，インスタンスを生成する．
	 */
	public State() {
		this.init();
	}
	
	public State(Piece[][] board, HashMap<Piece, Integer> capturedPieces) {
		this.board = board.clone();
		//this.capturedPieces = (HashMap<Piece, Integer>)capturedPieces.clone(); 
		this.capturedPieces = new HashMap<Piece, Integer>(capturedPieces);
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
		this.capturedPieces = new HashMap<Piece, Integer>();
		this.capturedPieces.put(new Fu(true), 0);
		this.capturedPieces.put(new Fu(false), 0);
		this.capturedPieces.put(new Kyosha(true), 0);
		this.capturedPieces.put(new Kyosha(false), 0);
		this.capturedPieces.put(new Keima(true), 0);
		this.capturedPieces.put(new Keima(false), 0);
		this.capturedPieces.put(new Gin (true), 0);
		this.capturedPieces.put(new Gin(false), 0);
		this.capturedPieces.put(new Kin(true), 0);
		this.capturedPieces.put(new Kin(false), 0);
		this.capturedPieces.put(new Kaku(true), 0);
		this.capturedPieces.put(new Kaku(false), 0);
		this.capturedPieces.put(new Hisha(true), 0);
		this.capturedPieces.put(new Hisha(false), 0);
		//盤面の初期化
		this.board[9][1] = new Kyosha(true);
		this.board[8][1] = new Keima(true);
		this.board[7][1] = new Gin(true);
		this.board[6][1] = new Kin(true);
		this.board[5][1] = new Ou(true);
		this.board[4][1] = new Kin(true);
		this.board[3][1] = new Gin(true);
		this.board[2][1] = new Keima(true);
		this.board[1][1] = new Kyosha(true);
		this.board[2][2] = new Kaku(true);
		this.board[8][2] = new Hisha(true);
		this.board[9][9] = new Kyosha(false);
		this.board[8][9] = new Keima(false);
		this.board[7][9] = new Gin(false);
		this.board[6][9] = new Kin(false);
		this.board[5][9] = new Ou(false);
		this.board[4][9] = new Kin(false);
		this.board[3][9] = new Gin(false);
		this.board[2][9] = new Keima(false);
		this.board[1][9] = new Kyosha(false);
		this.board[2][2] = new Kaku(false);
		this.board[8][2] = new Hisha(false);
		for(int i = 1; i < 10; i++) {
			this.board[i][3] = new Fu(true);
			this.board[i][7] = new Fu(false);
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
		return true;
	}

	/**
	 * 手を適用して，状態を変化させる．
	 * @param move 適用する手．
	 */
	public void makeAMove(Move move) {
	}
}
