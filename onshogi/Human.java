package onshogi;

/**
 * Playerを継承. 人からの手の入力をAdministratorに仲介するクラス.
 * @author oshun119
 */
public class Human extends Player {

	public Human(boolean isBlack) {
		super(isBlack);
	}
	
	@Override
	public Move nextMove(State currentState) {
		return new Move();
	}
	
	@Override
	public String toString() {
		return "";
	}
	
}
