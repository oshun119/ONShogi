package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 銀の駒クラス．
 * @author nisshy
 */
public class Gin extends Piece {
	/**
	 * 銀のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public Gin(boolean isBlackPiece) {
		super(isBlackPiece);
	}

	@Override
	HashSet<Point> getMovePattern() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	boolean hasPromoted() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public Piece getPromoted() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Piece getOriginal() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public String toString() {
		return this.isBlackPiece ? " 銀" : "v銀";
	}
}
