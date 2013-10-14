package onshogi;

/**
 * 適当な手を返すAI.
 * @author oshun119 
 */
public class RandomAI extends Player {
	public RandomAI(boolean isBlack) {
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
