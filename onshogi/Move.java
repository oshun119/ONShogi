package onshogi;

import java.awt.Point;

/**
 * 移動する駒, 移動元, 移動先, 成るか の情報を渡すためのクラス
 * @author oshun119
 * @author nisshy
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
		
	/**
	 * 盤上の駒を動かす場合．
	 * @param fromPoint 駒の移動元の座標． 
	 * @param toPoint 駒の移動先の座標．
	 * @param hasPromoted 駒が成るか否か．
	 */
	public Move(Point fromPoint, Point toPoint, boolean hasPromoted) {
		this.fromPoint = fromPoint;
		this.toPoint = toPoint;
		this.hasPromoted = hasPromoted;
		this.piece = null;
	}
	
	/**
	 * 駒を打つ場合．
	 * @param toPoint 駒を打つ位置
	 * @param piece 打つ駒．
	 */
	public Move(Point toPoint, Piece piece) {
		this.fromPoint = null;
		this.toPoint = toPoint;
		this.hasPromoted = false;
		this.piece = piece;
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
