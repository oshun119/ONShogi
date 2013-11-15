
package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 馬の駒クラス．
 * @author nisshy
 */
public class Uma extends Piece {
	private static HashSet<Point> movePattern;
	
	static {
		Uma.movePattern = new HashSet<Point>();
		for(int i = 1; i < State.SIZE; i++) {
			Uma.movePattern.add(new Point(i, i));
			Uma.movePattern.add(new Point(i, -i));
			Uma.movePattern.add(new Point(-i, -i));
			Uma.movePattern.add(new Point(-i, i));
		}
	}
	
	/**
	 * 馬のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public Uma(boolean isBlackPiece) {
		super(isBlackPiece);
	}
	
	@Override
	HashSet<Point> getMovePattern() {
		return Uma.movePattern;
	}

	@Override
	public boolean hasPromoted() {
		return true;
	}

	@Override
	public Piece getPromoted() {
		return this;
	}

	@Override
	public Piece getOriginal() {
		return new Uma(!this.isBlackPiece);
	}

	@Override
	public String toString() {
		return this.isBlackPiece ? " 馬" : "v馬";
	}
}
