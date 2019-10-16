public class StringFormated {
    public static void main(String[] args){
      // 書式指定文字列
      // % プレースホルダー
      // format()メソッド
      // String.format("%d,%s,%s", 3, "今日", "金曜日"); // -> 3,今日,金曜日
      // プレースホルダー
      // % [修飾][桁][型[ //修飾->省略可能、桁->省略可能 型->指定必須
      // 修飾 3桁ごとにカンマ　0空き領域を0うめ -左寄せ（数字）+符号を強制表示
      // 桁->表示形式を指定するn.m、全体でn桁小数点以下m桁
      // 型-> d:整数, s:文字列, f:小数 b:真偽値
      //  final String FORMAT = "%8s %6s 所持金%m5d";
      // String s = String.format(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
      // System.out.println(s);
      System.out.printf("製造番号%s-%02d", "SVJ", 3);

    }

}