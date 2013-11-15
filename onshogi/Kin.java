package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 金の駒クラス．
 * @author nisshy
 */
public class Kin extends Piece {
	private static HashSet<Point> blackMovePattern;
	
	private static HashSet<Point> whiteMovePattern;
	
	static {
		Kin.blackMovePattern = new HashSet<Point>();
		Kin.whiteMovePattern = new HashSet<Point>();
		
		for(int x = -1; x <= 1; x++) {
			for(int y = 0; y <= 1; y++) {
				Kin.blackMovePattern.add(new Point(x, -y));
				Kin.whiteMovePattern.add(new Point(x, y));
			}
		}

		Kin.blackMovePattern.add(new Point(0, 1));
		Kin.whiteMovePattern.add(new Point(0, -1));
	}
	
	/**
	 * 金のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public Kin(boolean isBlackPiece) {
		super(isBlackPiece);
	}

	@Override
	HashSet<Point> getMovePattern() {
		return this.isBlackPiece ? Kin.blackMovePattern : Kin.whiteMovePattern;
	}

	@Override
	public boolean hasPromoted() {
		return false;
	}

	@Override
	public Piece getPromoted() {
		return null;
	}

	@Override
	public Piece getOriginal() {
		return new Kin(!this.isBlackPiece);
	}

	@Override
	public String toString() {
		return this.isBlackPiece ? " 金" : "v金";
	}
}
