package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 桂馬の駒クラス．
 * @author nisshy
 */
public class Keima extends Piece {
	/**
	 * このインスタンスが一番初めに生成されたとき,
	 * この駒の移動できる座標をmovePatternに格納する.
	 * 先手と後手で分ける．
	 */
	private static HashSet<Point> blackMovePattern;
	private static HashSet<Point> whiteMovePattern;
	
	static {
		blackMovePattern = new HashSet<Point>();
		blackMovePattern.add(new Point(-1,-2)); 
		blackMovePattern.add(new Point(1,-2));
	}
	
	static {
		whiteMovePattern = new HashSet<Point>();
		whiteMovePattern.add(new Point(-1,2)); 
		whiteMovePattern.add(new Point(1,2)); 
	}
	
	/**
	 * 桂馬のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public Keima(boolean isBlackPiece) {
		super(isBlackPiece);
	}

	@Override
	HashSet<Point> getMovePattern() {
		return this.isBlackPiece ? Keima.blackMovePattern : Keima.whiteMovePattern;
	}

	@Override
	boolean hasPromoted() {
		return false;
	}

	@Override
	public Piece getPromoted() {
		return new NariKei(this.isBlackPiece);
	}

	@Override
	public Piece getOriginal() {
		return new Keima(!isBlackPiece);
	}	
	
	@Override
	public String toString() {
		return this.isBlackPiece ? " 桂" : "v桂";
	}
}
