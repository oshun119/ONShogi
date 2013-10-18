package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 成香のクラス．
 * @author nisshy
 */
public class NariKyo extends Piece {
	/**
	 * 成香のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public NariKyo(boolean isBlackPiece) {
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
		return new Kyosha(this.isBlackPiece);
	}
	
	@Override
	public String toString() {
		return this.isBlackPiece ? " 杏" : "v杏";
	}
}
