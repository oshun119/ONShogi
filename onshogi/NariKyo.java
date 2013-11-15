package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 成香のクラス．
 * @author nisshy
 */
public class NariKyo extends Piece {
	private static HashSet<Point> blackMovePattern;
	
	private static HashSet<Point> whiteMovePattern;
	
	static {
		NariKyo.blackMovePattern = new HashSet<Point>();
		NariKyo.whiteMovePattern = new HashSet<Point>();
		
		for(int x = -1; x <= 1; x++) {
			for(int y = 0; y <= 1; y++) {
				NariKyo.blackMovePattern.add(new Point(x, -y));
				NariKyo.whiteMovePattern.add(new Point(x, y));
			}
		}

		NariKyo.blackMovePattern.add(new Point(0, 1));
		NariKyo.whiteMovePattern.add(new Point(0, -1));
	}
	
	/**
	 * 成香のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public NariKyo(boolean isBlackPiece) {
		super(isBlackPiece);
	}
	
	@Override
	HashSet<Point> getMovePattern() {
		return this.isBlackPiece ? NariKyo.blackMovePattern : NariKyo.whiteMovePattern;
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
		return new Kyosha(!this.isBlackPiece);
	}
	
	@Override
	public String toString() {
		return this.isBlackPiece ? " 杏" : "v杏";
	}
}
