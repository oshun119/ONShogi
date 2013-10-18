
package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 龍の駒クラス．
 * @author nisshy
 */
public class Ryu extends Piece {
	/**
	 * 龍のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public Ryu(boolean isBlackPiece) {
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
		return new Hisha(this.isBlackPiece);
	}

	@Override
	public String toString() {
		return this.isBlackPiece ? " 龍" : "v龍";
	}
}
