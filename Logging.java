import java.util.logging.*;

public class Logging {
  public static void main (String[] args) {
    // ログを出力するクラスのインスタンスを取得する
    // ロガーには何か名前をつける必要がある。与える名前としては、FQCN（完全修飾クラス名）を利用することが多い
    final Logger logger = Logger.getLogger("Logging");
    // ロガーに対して「info」レベルでログメッセージを出力する
    logger.info("this is test file for logging.");
    logger.warning("this is test file for logging.");
    logger.severe("this is test file for logging.");

  }
}