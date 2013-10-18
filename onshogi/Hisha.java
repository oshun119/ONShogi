package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 飛車の駒クラス． 
 * @author nisshy
 */
public class Hisha extends Piece {
	/**
	 * 飛車のインスタンスを生成する．
	 * @param isBlackPiece この駒が先手番の駒か否か
	 */
	public Hisha(boolean isBlackPiece) {
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
		return new Ryu(this.isBlackPiece);
	}

	@Override
	public Piece getOriginal() {
		return this;
	}
	
	@Override
	public String toString() {
		return this.isBlackPiece ? " 飛" : "v飛";
	}
}
