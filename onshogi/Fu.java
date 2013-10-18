package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 *  歩のクラス．
 *  @author nisshy
 */
public class Fu extends Piece {
	/**
	 * 歩のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public Fu(boolean isBlackPiece) {
		super(isBlackPiece);
	}

	@Override
	HashSet<Point> getMovePattern() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	boolean hasPromoted() {
		return false;
	}

	@Override
	public Piece getPromoted() {
		return new To(this.isBlackPiece);
	}
	
	@Override
	public Piece getOriginal() {
		return this;
	}
	
	@Override
	public String toString() {
		return this.isBlackPiece ? " 歩" : "v歩";
	}
}
