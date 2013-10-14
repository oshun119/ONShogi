package onshogi;

import java.awt.Point;

/**
 * 移動する駒, 移動元, 移動先, 成るか の情報を渡すためのクラス
 * @author oshun119
 */
public class Move extends Object{
	/**
	 * 移動元の座標
	 */
	private Point fromPoint;
	
	/**
	 * 移動先の座標
	 */
	private Point toPoint;
	
	/**
	 * 成るかどうか
	 * 成る:true, 成らない:false
	 */
	private boolean hasPromoted;
	
	/**
	 * 駒の情報,今のところPiece
	 */
	private Piece piece;
	
	
	public Move(Point fromPoint, Point toPoint, boolean hasPromoted) {
		
	}
	
	/**
	 * 移動元の座標を返す
	 * @return 移動元の座標
	 */
	public Point getFromPoint() {
		return this.fromPoint;
	}
	
	/**
	 * 移動先の座標を返す
	 * @return 移動先の座標
	 */
	public Point getToPoint() {
		return this.toPoint;
	}
	
	/**
	 * 成るかどうかの真偽を返す
	 * @return 成るかどうか 
	 */
	public boolean hasPromoted() {
		return this.hasPromoted;
	}
	
	/**
	 * 移動・打つとき, その駒を返す
	 * @return 駒の種類
	 */
	public Piece getPiece() {
		return this.piece;
	}
	
}
