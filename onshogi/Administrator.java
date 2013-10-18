package onshogi;

/**
 * 対局の管理を行い，進行するクラス．
 * @author nisshy
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
	 * @param isBlackTurn 先手の手番か否か
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
		System.out.println(this);
		
		while(!currentState.isEnd()) {
			Move nextMove = null;
			

			if(this.isBlackTurn)
				nextMove = this.blackPlayer.nextMove(this.currentState.clone());
			else
				nextMove = this.whitePlayer.nextMove(this.currentState.clone());
			
			if(!this.currentState.isLegalMove(nextMove)) {
				System.out.println("不正な手が入力されました．");
				break;
			}
			
			this.currentState.makeAMove(nextMove);
			this.isBlackTurn = !this.isBlackTurn;
			System.out.println(this);
		}
		
		String winner;
		if(this.isBlackTurn)
			winner = this.whitePlayer.toString();
		else
			winner = this.blackPlayer.toString();
		
		System.out.println(winner + "win!");
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("black:");
		builder.append(this.blackPlayer);
		builder.append(" white: ");
		builder.append(this.whitePlayer);
		
		if(isBlackTurn)
			builder.append("\nIt is black turn now.\n");
		else
			builder.append("\nIt is white turn now.\n");
		
		builder.append(this.currentState);
		return builder.toString();
	}
}
