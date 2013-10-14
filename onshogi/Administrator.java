package onshogi;

/**
 * 対局の管理を行い，進行するクラス．
 */
public class Administrator extends Object implements Runnable {
	/**
	 * 先手のPlayer．
	 */
	private Player blackPlayer;
	
	/**
	 * 後手のPlayer．
	 */
	private Player whitePlayer;
	
	/**
	 * 現在の盤面状態．
	 */
	private State currentState;
	
	/**
	 * 現在，先手番か否か．
	 */
	private boolean isBlackTurn;
	
	
	/**
	 * 先手：Human, 後手:RandomAI で開始する Administrator インスタンスを生成する． 
	 */
	public Administrator() {
		this(new Human(true), new RandomAI(false));
	} 

	/**
	 * 指定された，Player同士の対局を開始するAdministratorインスタンスを生成する．
	 * @param blackPlayer 先手のPlayerインスタンス
	 * @param whitePlayer 後手のPlayerインスタンス
	 */
	public Administrator(Player blackPlayer, Player whitePlayer) {
		this(blackPlayer, whitePlayer, new State(), true);
	}

	/**
	 * 指定された局面から，対局を開始するAdministratorインスタンスを生成する．
	 * @param blackPlayer 先手のPlayerインスタンス
	 * @param whitePlayer 後手のPlayerインスタンス
	 * @param initialState 盤面の初期状態
	 * @param isBlack 先手の手番か否か
	 */
	public Administrator(Player blackPlayer, Player whitePlayer, State initialState, boolean isBlackTurn) {
		this.blackPlayer = blackPlayer;
		this.whitePlayer = whitePlayer;
		this.currentState = initialState;
		this.isBlackTurn = isBlackTurn;
	}
	
	/**
	 * 対局を開始する．
	 */
	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
	}
	
	@Override
	public String toString() {
		return "";
	}
}
