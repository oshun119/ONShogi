package onshogi;

/**
 * このクラスを継承し, 操作をAdministratorに仲介する.
 * @author oshun119 
 */
abstract public class Player extends Object{
	
	/**
	 * 先手:true, 後手:falseとする
	 */
	protected boolean isBlack;
	
	public Player(boolean isBlack) {
		this.isBlack = isBlack;
	}

	/**
	 * 現在の盤面の状態を得て, 手を生成して返す. 
	 * @param currentState 現在の盤面の状態
	 * @return 候補の手を返す
	 */
	abstract public Move nextMove(State currentState);

	public String toString() {
		return "";
	}
	
}
