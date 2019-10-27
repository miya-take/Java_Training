import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Collection{
  public static void main(String[] args) {
    // ArryaListを確保
    // ArrayListの特徴
    // 不等号のカッコを使い、格納するものの型を指定する. どのような種類のオブジェクトも格納することができる
    // 「自動的に用をが増える特性」が便利なため、ArrayListが使われている
    
    // コレクションでは、インスタンスでないものは格納できない
    // 基本データ型(プリミティブ型)はラップすることで使用できる
    ArrayList<Integer> points = new ArrayList<Integer>();
    // AutoBoxing機能による自動的にInteger型に変換される
    points.add(90);
    points.add(70);
    points.add(10);
    // 拡張for文も使用可能
    for (int i : points){
      System.out.println(i);
    }

    System.out.println("イテレータ");
    ArrayList<String> names = new ArrayList<String>();
    names.add("sato");
    names.add("tanake");
    names.add("yamada");
    // イテレータの取得
    Iterator<String> it = names.iterator();
    while(it.hasNext()){
      String e = it.next();
      System.out.println(e);
    }

    System.out.println("Set");
    // 重複した値は無視される
    // set()やget()がない。要素同士に順序がないため。添字は使えない
    // 一つずつ取り出す際の順序は不明
    Set<String> alphabets = new HashSet<String>();
    alphabets.add("a");
    alphabets.add("b");
    alphabets.add("c");
    alphabets.add("a"); // 無視される
    System.out.println("alphabetsは" + alphabets.size() + "種類");







  }

}