package onshogi;

import java.util.HashMap;

/**
 * 盤面の状況を表すStateクラス．
 * @author nishidamasahiko
 */
public class State extends Object{
	public static final int SIZE = 11; 
	
	/**
	 * 盤面上の状態
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
	
	/**
	 * 対局の初期状態に初期化する．
	 */
	public void init() {
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
