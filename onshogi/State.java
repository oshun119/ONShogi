package onshogi;

import java.util.HashMap;

/**
 * 盤面の状況を表すStateクラス．
 * @author nisshy
 */
public class State extends Object{
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
		this.capturedPieces = (HashMap<Piece, Integer>)capturedPieces.clone();
	}
	
	/**
	 * 対局の初期状態に初期化する．
	 */
	public void init() {
		this.capturedPieces = new HashMap<Piece, Integer>();
		this.capturedPieces.put(new Fu(true), 0);
		this.capturedPieces.put(new Fu(false), 0);
		this.capturedPieces.put(new Kyosha(true), 0);
		
		this.board[1][5] = new Ou(false);
		this.board[8][8] = new Hisha(true);
	}

	/**
	 * 終了状態かを判定して応答する．
	 * @return 終了状態か否か．
	 */
	public boolean isEnd() {
		return true;
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
