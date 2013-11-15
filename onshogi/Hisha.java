package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 飛車の駒クラス． 
 * @author nisshy
 */
public class Hisha extends Piece {
	
	private static HashSet<Point> movePattern;
	
	static {
		Hisha.movePattern = new HashSet<Point>();
		for(int i = 1; i < State.SIZE; i++) {
			Hisha.movePattern.add(new Point(i, 0));
			Hisha.movePattern.add(new Point(-i, 0));
			Hisha.movePattern.add(new Point(0, i));
			Hisha.movePattern.add(new Point(0, -i));
		}
	}
	
	/**
	 * 飛車のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public Hisha(boolean isBlackPiece) {
		super(isBlackPiece);
	}

	@Override
	HashSet<Point> getMovePattern() {
		return Hisha.movePattern;
	}

	@Override
	boolean hasPromoted() {
		return false;
	}

	@Override
	public Piece getPromoted() {
		return new Ryu(this.isBlackPiece);
	}

	@Override
	public Piece getOriginal() {
		return new Hisha(!this.isBlackPiece);
	}
	
	@Override
	public String toString() {
		return this.isBlackPiece ? " 飛" : "v飛";
	}
}
