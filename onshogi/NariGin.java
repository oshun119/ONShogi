package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 成銀の駒クラス．
 * @author nisshy
 */
public class NariGin extends Piece {
	/**
	 * 成銀のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public NariGin(boolean isBlackPiece) {
		super(isBlackPiece);
	}

	@Override
	HashSet<Point> getMovePattern() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
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
		return new Gin(this.isBlackPiece);
	}

	@Override
	public String toString() {
		return this.isBlackPiece ? " 全" : "v全";
	}
}
