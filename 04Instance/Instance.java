import java.util.ArrayList;
import java.util.List;

public class Instance {
  public static void main(String[] args){
    System.out.println("================================");
    System.out.println("toString()");
    System.out.println("================================j");
    class Hero {
      private String name;
      private int hp, mp;
      Hero(String name, int hp, int mp){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
      }
      Hero(String name, int hp){
        this(name, hp, 0);
      }
      Hero (String name){
        this(name, 0);
      }
      Hero(){
        this("TEST");
      }
	    @Override
      public String toString(){
        return (this.name + "HP/" + this.hp + "MP/" + this.mp);
      }
    }
    Hero hero1 = new Hero();
    System.out.println(hero1.toString());
    System.out.println("================================");
    System.out.println("equals()");
    System.out.println("================================");
    class Account {
      private String accountNo;
      @Override
      public boolean equals(Object o){
        // (1)自分自身が引数として渡された場合には無条件でtrue
        if(o == this) return true;
        // (2)nullが引数として渡された場合には、無条件でfalse
        if(o == null) return false;
        // (3)比較し型が異なるならば、falseを返す。（同じならば(4)に備えて、比較できるように適切にキャストする
        if(!(o instanceof Account)) return false;
        // キャスト
        Account r = (Account) o;
        // 二つのインスタンスがもつ然るべきフィールドどうしを比較して、等価か判定する
        if(!this.accountNo.trim().equals(r.accountNo.trim())){
          return false;
        }
        return true;
      }
    }
    System.out.println("================================");
    System.out.println("equals()のオーバライドを行わずに問題が発生するパターン");
    System.out.println("================================");
    class Member{
      private String name;
    }
    List<Member> memberList = new ArrayList<Member>();
    Member m1 = new Member();
    m1.name = "bbb";
    memberList.add(m1);
    System.out.println("The number of member is " + memberList.size());
    m1 = new Member();
    m1.name = "bbb";
    memberList.remove(m1);
    // 本来ならば、削除されて0になっていないといけない
    // だが、remove()は引数rにあるインスタンを渡して、「これと同じものを削除する」よう事項
    // JVMは、ArrayListから同じものを探すためにequals()による等価判定を行う。
    // その際にh、equals()をオーバーライドしていない、等価判定に不具合があるクラスをコレクションに格納すると、要素の検索や削除が正しく行われないj
    System.out.println("The number of member is " + memberList.size());

    
  }
}