package onshogi;

import java.awt.Point;
import java.util.HashSet;

/**
 * 盤面外を表すクラス．
 * @author nisshy
 */
public class OutOfBoard extends Piece {
	public OutOfBoard() {
		super(true);
	}
	
	public OutOfBoard(boolean isBlackPiece) {
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
}
