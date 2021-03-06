package onshogi;

import java.awt.Point;

/**
 * 適当な手を返すAI.
 * @author oshun119 
 * @author nisshy
 */
public class RandomAI extends Player {
	public RandomAI(boolean isBlack) {
		super(isBlack);
	}
	
	@Override
	public Move nextMove(State currentState) {
		return new Move(new Point(), new  Point(), true);
	}
	
	@Override
	public String toString() {
		return "RandomAI";
	}
}
