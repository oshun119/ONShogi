package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 角のクラス．
 * @author nisshy
 */
public class Kaku extends Piece {
	/**
	 * このインスタンスが一番初めに生成されたとき,
	 * この駒の移動できる座標をmovePatternに格納する.
	 * 先手と後手で分ける．
	 */
	private static HashSet<Point> blackMovePattern;
	private static HashSet<Point> whiteMovePattern;
	
	static {
		blackMovePattern = new HashSet<Point>();
		for(int i = 1; i < State.SIZE; i++) {
			blackMovePattern.add(new Point(i,i));
			blackMovePattern.add(new Point(-i,-i));
			blackMovePattern.add(new Point(-i,i));
			blackMovePattern.add(new Point(i,-i));
		}
	}
	
	static {
		whiteMovePattern = new HashSet<Point>();
		for(int i = 1; i < State.SIZE; i++) {
			whiteMovePattern.add(new Point(i,i));
			whiteMovePattern.add(new Point(-i,-i));
			whiteMovePattern.add(new Point(-i,i));
			whiteMovePattern.add(new Point(i,-i));
		}
	}
	
	
	/**
	 * 角のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public Kaku(boolean isBlackPiece) {
		super(isBlackPiece);
	}

	@Override
	HashSet<Point> getMovePattern() {
		return this.isBlackPiece ? Kaku.blackMovePattern : Kaku.whiteMovePattern;
	}

	@Override
	public boolean hasPromoted() {
		return false;
	}

	@Override
	public Piece getPromoted() {
		return new Uma(this.isBlackPiece);
	}

	@Override
	public Piece getOriginal() {
		return new Kaku(!isBlackPiece);
	}

	@Override
	public String toString() {
		return this.isBlackPiece ? " 角" : "v角";
	}
}
