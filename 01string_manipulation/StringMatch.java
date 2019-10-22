public class StringMatch{
  public static void main(String[] args) {
    String s = "java";
    s.matches("java");     // true
    s.matches("Java");     // true
    s.matches("javajava"); // true

    // 1. ピリオド一文字
    // 任意の1文字であればよいい; // true
    "Java".matches("J.va"); // true

    // 2. アスタリスク0回以上の繰り替えし
    "Jaaaaaaaaaaaava".matches("Ja*va"); // true
    // 全ての文字列を許す
    "Abc888ああ".matches(".*"); // true
    // endsWith() startsWith()の代わりにできる
    s.matches("Ma.*"); //Maで始まる任意の文字列
    s.matches(".*va"); //vaで終わる任意の文字列

    // 3. 波括弧:指定回数の繰り返し
    // 直前の文字の指定回数の繰り返し
    // "HEL{3})" -> "HELLLO"
    // {n} n回の繰り返し
    // {n,} n回以上の繰り返し
    // {n,m} n回以上m回以下の繰り返し
    // ? 0回また1回の繰り返し
    // + 直前の文字の1回以上の繰り返し
    // [] いずれかの文字
    // [-] 指定範囲のいずれかの文字
    "url".matches([a-z]{3}); // ->true

    // パターン定義
    // \dいずれかの数字
    // \w 英字数字アンダーバー [a-zA-Z_0-9]
    // \s 空白文字(スペース、タブ文字、改行文字など）


    // ハットとダラー　先頭と末尾
    // ^ 先頭の文字列
    // $ 末尾の文字列

    // 文字列の分割regex
    String ss = "abc,def:ghi";
    String[] words = s.split("[,:]");
    for(String w : words){
      System.out.println(w + "->");
    }

    String ww = ss.replaceAll("[beh]", "X");
    System.out.println(ww); // aXc,dXf:gXi






  public boolean isValidPlayerName(String name){
    // pertern matching
    // 文字列がパターンンンンンに従った形式を満たしているか確認する
    return name.matches("[A-Z][A-Z0-9]{7}");
  }
}