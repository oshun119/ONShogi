package onshogi;

/**
 * Mainクラス．
 * @author nisshy
 */
public class Main extends Object {
	/**
	 * 先手：Human, 後手:Human のAdministratorを生成し，対局を開始する．
	 * @param arguments コマンドライン引数
	 */
    public static void main(String[] arguments) {
    	Administrator admin = new Administrator(new Human(true), new Human(false));
    	Thread gameThread = new Thread(admin);
    	gameThread.start();
    }
}
