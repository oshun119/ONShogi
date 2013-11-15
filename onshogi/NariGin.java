package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 成銀の駒クラス．
 * @author nisshy
 */
public class NariGin extends Piece {
	private static HashSet<Point> blackMovePattern;
	
	private static HashSet<Point> whiteMovePattern;
	
	static {
		NariGin.blackMovePattern = new HashSet<Point>();
		NariGin.whiteMovePattern = new HashSet<Point>();
		
		for(int x = -1; x <= 1; x++) {
			for(int y = 0; y <= 1; y++) {
				NariGin.blackMovePattern.add(new Point(x, -y));
				NariGin.whiteMovePattern.add(new Point(x, y));
			}
		}

		NariGin.blackMovePattern.add(new Point(0, 1));
		NariGin.whiteMovePattern.add(new Point(0, -1));
	}
	
	/**
	 * 成銀のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public NariGin(boolean isBlackPiece) {
		super(isBlackPiece);
	}

	@Override
	HashSet<Point> getMovePattern() {
		return this.isBlackPiece ? NariGin.blackMovePattern : NariGin.whiteMovePattern;
	}

	@Override
	boolean hasPromoted() {
		return true;
	}

	@Override
	public Piece getPromoted() {
		return null;
	}

	@Override
	public Piece getOriginal() {
		return new Gin(!this.isBlackPiece);
	}

	@Override
	public String toString() {
		return this.isBlackPiece ? " 全" : "v全";
	}
}
