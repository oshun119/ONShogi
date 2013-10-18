package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 金の駒クラス．
 * @author nisshy
 */
public class Kin extends Piece {
	/**
	 * 金のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public Kin(boolean isBlackPiece) {
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
		return null;
	}

	@Override
	public Piece getOriginal() {
		return this;
	}

	@Override
	public String toString() {
		return this.isBlackPiece ? " 金" : "v金";
	}
}
