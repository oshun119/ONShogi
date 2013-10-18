package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 香車を表す駒クラス．
 * @author nisshy
 */
public class Kyosha extends Piece {
	/**
	 * 香車のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public Kyosha(boolean isBlackPiece) {
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
		return new NariKyo(this.isBlackPiece);
	}
	
	@Override
	public Piece getOriginal() {
		return this;
	}

	@Override
	public String toString() {
		return this.isBlackPiece ? " 香" : "v香";
	}
}
