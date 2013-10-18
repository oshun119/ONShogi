package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 角のクラス．
 * @author nisshy
 */
public class Kaku extends Piece {
	/**
	 * 角のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public Kaku(boolean isBlackPiece) {
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
		return new Uma(this.isBlackPiece);
	}

	@Override
	public Piece getOriginal() {
		return this;
	}

	@Override
	public String toString() {
		return this.isBlackPiece ? " 角" : "v角";
	}
}
