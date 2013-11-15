package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 香車を表す駒クラス．
 * @author nisshy
 */
public class Kyosha extends Piece {
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
			blackMovePattern.add(new Point(0,-i)); 
		}
	}
	
	static {
		whiteMovePattern = new HashSet<Point>();
		for(int i = 1; i < State.SIZE; i++) {
			whiteMovePattern.add(new Point(0,i)); 
		}
	}
	
	/**
	 * 香車のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public Kyosha(boolean isBlackPiece) {
		super(isBlackPiece);
	}

	@Override
	HashSet<Point> getMovePattern() {
		return this.isBlackPiece ? Kyosha.blackMovePattern : Kyosha.whiteMovePattern;
	}

	@Override
	boolean hasPromoted() {
		return false;
	}

	@Override
	public Piece getPromoted() {
		return new NariKyo(this.isBlackPiece);
	}
	
	@Override
	public Piece getOriginal() {
		return new Kyosha(!isBlackPiece);
	}

	@Override
	public String toString() {
		return this.isBlackPiece ? " 香" : "v香";
	}
}
