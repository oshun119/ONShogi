package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 成桂の駒クラス．
 * @author nisshy
 */
public class NariKei extends Piece {
	private static HashSet<Point> blackMovePattern;
	
	private static HashSet<Point> whiteMovePattern;
	
	static {
		NariKei.blackMovePattern = new HashSet<Point>();
		NariKei.whiteMovePattern = new HashSet<Point>();
		
		for(int x = -1; x <= 1; x++) {
			for(int y = 0; y <= 1; y++) {
				NariKei.blackMovePattern.add(new Point(x, -y));
				NariKei.whiteMovePattern.add(new Point(x, y));
			}
		}

		NariKei.blackMovePattern.add(new Point(0, 1));
		NariKei.whiteMovePattern.add(new Point(0, -1));
	}
	
	/**
	 * 成桂のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public NariKei(boolean isBlackPiece) {
		super(isBlackPiece);
	}

	@Override
	HashSet<Point> getMovePattern() {
		return this.isBlackPiece ? NariKei.blackMovePattern : NariKei.whiteMovePattern;
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
		return new Keima(!this.isBlackPiece);
	}

	@Override
	public String toString() {
		return this.isBlackPiece ? " 圭" : "v圭";
	}
}
