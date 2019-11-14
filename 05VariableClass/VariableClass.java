import sun.tools.jstat.SymbolResolutionClosure;

public class VariableClass {
  public static void prints(Object a, Object b){
    for (int i = 0; i< (Integer)b; i++){
      System.out.println(a);
    }
  }

  public static void main(String[] args){
    Object s = "こんにちは ";
    Object n = 1;
    // 下の例の場合、Object型で指定しているから、コンパイルエラーにはならない
    // 実行のタイミングで初めてエラーとわかる
    prints(n, s);
  }

  System.out.println("================================");
  System.out.println("ジェネリクスを利用");
  System.out.println("================================");
  // 仮型引数Eを用いる
  public class Pocket<E>{
    private Object E data;
    public void put (E d) {this.date = d;}
    public E get() {return this.date;}
  }
  System.out.println("================================");
  System.out.println("列挙型");
  System.out.println("================================");

  private enum AccountType{
    FUTSU, TOUZA, TEIKI;
  }

  public class Account {
    private String accountNo;
    private AccountType accoutType;
    private Account(String accontNo, AccontTyep accountType){

    }
  }

}