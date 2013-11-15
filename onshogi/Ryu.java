
package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 龍の駒クラス．
 * @author nisshy
 */
public class Ryu extends Piece {
	private static HashSet<Point> movePattern;
	
	static {
		Ryu.movePattern = new HashSet<Point>();
		for(int i = 1; i < State.SIZE; i++) {
			Ryu.movePattern.add(new Point(i, 0));
			Ryu.movePattern.add(new Point(-i, 0));
			Ryu.movePattern.add(new Point(0, i));
			Ryu.movePattern.add(new Point(0, -i));
		}
		
		Ryu.movePattern.add(new Point(1, 1));
		Ryu.movePattern.add(new Point(1, -1));
		Ryu.movePattern.add(new Point(-1, -1));
		Ryu.movePattern.add(new Point(-1, 1));
	}
		
	/**
	 * 龍のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public Ryu(boolean isBlackPiece) {
		super(isBlackPiece);
	}
	
	@Override
	HashSet<Point> getMovePattern() {
		return Ryu.movePattern;
	}

	@Override
	public boolean hasPromoted() {
		return true;
	}

	@Override
	public Piece getPromoted() {
		return null;
	}

	@Override
	public Piece getOriginal() {
		return new Hisha(!this.isBlackPiece);
	}

	@Override
	public String toString() {
		return this.isBlackPiece ? " 龍" : "v龍";
	}
}
