
package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * と金の駒クラス．
 * @author nisshy
 */
public class To extends Piece {
	private static HashSet<Point> blackMovePattern;
	
	private static HashSet<Point> whiteMovePattern;
	
	static {
		To.blackMovePattern = new HashSet<Point>();
		To.whiteMovePattern = new HashSet<Point>();
		
		for(int x = -1; x <= 1; x++) {
			for(int y = 0; y <= 1; y++) {
				To.blackMovePattern.add(new Point(x, -y));
				To.whiteMovePattern.add(new Point(x, y));
			}
		}

		To.blackMovePattern.add(new Point(0, 1));
		To.whiteMovePattern.add(new Point(0, -1));
	}
	
	/**
	 * と金のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public To(boolean isBlackPiece) {
		super(isBlackPiece);
	}
	
	@Override
	HashSet<Point> getMovePattern() {
		return this.isBlackPiece ? To.blackMovePattern : To.whiteMovePattern;
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
		return new Fu(!this.isBlackPiece);
	}

	@Override
	public String toString() {
		return this.isBlackPiece ? " と" : "vと";
	}
}
