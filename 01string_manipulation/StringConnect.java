public class StringConnect {
  // StringBuilderを用いが方が、高い性能で連結を実装できる。
  // StringBuilderインスタンスは、内部に連結した文字列を蓄えるメモリ領域（バッファ）を備える。
  // メソッドチェーン
  // 自身への参照を返すメソッドを連続して呼び出す方法
  // StringBuilder sb = new StringBuilder();
  // sb.append("Java").append("Ruby").append("Python");
  // ----------------------------------------
  // 多数の文字列を連結する場合には、最も高いん性能を発揮するStringBulderを使用する
  // しかし、スレッドを利用している場合には、StringBuilderでは不具合に繋がる恐れがある
  // そうした場合には、「StringBuffer」を利用する
  // ----------------------------------------

  public static void main(String[] args){
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 100; i++){
      // バッファにJavaを追加
      sb.append("Java");
    }
    //完成し連結ずみ文字列を取り出す
    String s = sb.toString();
    System.out.println(s);

    String str = "123";
    char[] data1 = str.toCharArray();
    for (char e : data1){
      System.out.println(e);
    }
    
  }
}