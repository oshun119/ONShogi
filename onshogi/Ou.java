package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 王の駒クラス．
 * @author nisshy
 */
public class Ou extends Piece {
	
	private static HashSet<Point> movePattern;
	
	public Ou(boolean isBlackPiece) {
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
