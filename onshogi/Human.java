package onshogi;

import java.awt.Point;

/**
 * Playerを継承. 人からの手の入力をAdministratorに仲介するクラス.
 * @author oshun119
 * @author nisshy
 */
public class Human extends Player {

	public Human(boolean isBlack) {
		super(isBlack);
	}
	
	@Override
	public Move nextMove(State currentState) {
		return new Move(new Point(), new  Point(), true);
	}
	
	@Override
	public String toString() {
		return "You";
	}
}
