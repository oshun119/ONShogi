package onshogi;

/**
 * プレイヤーはこのクラスを継承して実装する. 人間ならばHumanを用いる.
 * @author oshun119 
 */
public class Player extends Object{
	
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
	public Move nextMove(State currentState) {
		return new Move();
	}

	public String toString() {
		return "";
	}
	
}
