package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 銀の駒クラス．
 * @author nisshy
 */
public class Gin extends Piece {
	/**
	 * このインスタンスが一番初めに生成されたとき,
	 * この駒の移動できる座標をmovePatternに格納する.
	 * 先手と後手で分ける．
	 */
	private static HashSet<Point> blackMovePattern;
	private static HashSet<Point> whiteMovePattern;
	
	static {
		blackMovePattern = new HashSet<Point>();
		blackMovePattern.add(new Point(0,-1)); //前
		blackMovePattern.add(new Point(1,-1)); //左前
		blackMovePattern.add(new Point(-1,-1)); //右前
		blackMovePattern.add(new Point(1,1)); //左後
		blackMovePattern.add(new Point(-1,1)); //右後
	}
	
	static {
		whiteMovePattern = new HashSet<Point>();
		whiteMovePattern.add(new Point(0,1)); //前
		whiteMovePattern.add(new Point(-1,1)); //左前
		whiteMovePattern.add(new Point(1,1)); //右前
		whiteMovePattern.add(new Point(-1,-1)); //左後
		whiteMovePattern.add(new Point(1,-1)); //右後
	}
	
	/**
	 * 銀のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public Gin(boolean isBlackPiece) {
		super(isBlackPiece);
	}

	@Override
	HashSet<Point> getMovePattern() {
		return this.isBlackPiece ? Gin.blackMovePattern : Gin.whiteMovePattern;
	}

	@Override
	boolean hasPromoted() {
		return false;
	}

	@Override
	public Piece getPromoted() {
		return new NariGin(this.isBlackPiece);
	}

	@Override
	public Piece getOriginal() {
		return new Gin(!this.isBlackPiece);
	}

	@Override
	public String toString() {
		return this.isBlackPiece ? " 銀" : "v銀";
	}
}
