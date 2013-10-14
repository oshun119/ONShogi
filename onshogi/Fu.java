package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 *  歩を表すクラス．
 *  @author nisshy
 */
public class Fu extends Piece {
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
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public Piece getPromoted() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
}
