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
		return null;
	}
	
	@Override
	public String toString() {
		return this.isBlackPiece ? " 壁" : "v壁";
	}
}
