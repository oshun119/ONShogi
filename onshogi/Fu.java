package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 *  歩のクラス．
 *  @author nisshy
 */
public class Fu extends Piece {
	
	/**
	 * このインスタンスが一番初めに生成されたとき,
	 * この駒の移動できる座標をmovePatternに格納する.
	 * 先手と後手で分ける．
	 */
	private static HashSet<Point> blackMovePattern;
	private static HashSet<Point> whiteMovePattern;
	
	static {
		blackMovePattern = new HashSet<Point>();
		blackMovePattern.add(new Point(0,-1));
	}
	
	static {
		whiteMovePattern = new HashSet<Point>();
		whiteMovePattern.add(new Point(0,1));
	}
	
	/**
	 * 歩のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public Fu(boolean isBlackPiece) {
		super(isBlackPiece);
	}

	@Override
	HashSet<Point> getMovePattern() {
		return this.isBlackPiece ? Fu.blackMovePattern : Fu.whiteMovePattern;
	}

	@Override
	public boolean hasPromoted() {
		return false;
	}

	@Override
	public Piece getPromoted() {
		return new To(this.isBlackPiece);
	}
	
	@Override
	public Piece getOriginal() {
		return new Fu(!this.isBlackPiece);
	}
	
	@Override
	public String toString() {
		return this.isBlackPiece ? " 歩" : "v歩";
	}
}
