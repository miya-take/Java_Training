import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;


interface Func1 {
  boolean call(int x)
}

interface Func2{
  String call (boolean mail, String name);
}
public class Function {
   public static int sub(int a, int b){
       return a - b;
     }
  public static boolean isOdd(int x) {
    return x % 2 == 0; 
  }

  public interface Func{
    public abstract String func(boolean idMale, String name);
  } 

  public static String addNamePrefix (boolean male, String name){
    if (male == true) {
      return "Mr." + name;
    } else {
      return "Ms." + name;
    }
  }
  public static void main(String[] args) {
    // sub メソッドの処理ロジックを変数funcに代入する
    // ここで代入されているのは、メソッドの実態ではない。subメソッドの参照
    IntBinaryOperator func = Function::sub;
    // 変数funcに格納されている処理ロジックを、引数と合わせて実行する
    int a = func.applyAsInt(5, 3);
    System.out.println("5-3は" + a);

    IntPredicate  odd = Function::isOdd;
    boolean resultOdd = odd.test(3);

    Func ooo = Main::addNamePrefix;





    // ラムダ式
    // 下の行が実行された瞬間に関数の実態が生み出される
    IntBinaryOperator funcLambda = (int a, int b) -> {return a - b;};
    //　省略記法
    IntToDoubleFunction func1 = (int x) -> {return x*x*3.14;};
    // 引数宣言における型を省略
    IntToDoubleFunction func2 = (x) -> {return x*x*3.14;};

    // 引数が一つの場合は丸括弧を省略
    IntToDoubleFunction func3 =  x -> {return x*x*3.14;};
    // ラムダ式が単一のreturnぶんお場合、波括弧とreturnを省略
    IntToDoubleFunction func4 = x ->  x*x*3.14;

    // 変数の利用
    double b = 1.41;
    IntToDoubleFunction func5 = (x) -> {return b * b * 3.14;};



  }
  

