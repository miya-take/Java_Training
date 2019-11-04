import java.util.ArrayList;
import java.util.List;
import java.util.Date;

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
    // その際にh、equals()をオーバーライドlー｀ない、等価判定に不具合があるクラスをコレクションに格納すると、要素の検索や削除が正しく行われないj
    System.out.println("The number of member is " + memberList.size());
    System.out.println("================================");
    System.out.println("cloneメソッド");
    System.out.println("================================");

    class Book implements Cloneable, Comparable<Book>{
      private String title;
      private Date publishDate;
      private String comment;
      Book(String title, Date, publishDate, String comment){
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
      }
      public setTitle(String title){
        this.title = title;
      }
      public getTitle(){
        return this.title;
      }
      public setPublishDate(String publishDate){
        this.publishDate = publishDate;
      }
      public getPublishDate(){
        return this.publishDate;
      }
      public setComment(String comment){
        this.comment = comment;
      }
      public getComment(){
        return this.comment;
      }
      @Override
      public boolean equals(Object obj) {
        if(obj == Book) {
          return true;
        }
        if(obj ==  null) {
          return false;
        }
        if(!(obj instanceof Book)){
          return false;
        } 
        Book objBook = (Book)obj;
        if(objBook.title.equals(this.book.title) && objBook.publishDate.equals(this.publishDate)){
          return true;
        }
        return false;
      }

      @Override
      public int hashCode() {
        int result = 37;
        result = result * 31 + this.title.hashCode();
        result = result * 31  + this.publishDate.hashCode();
        return result;
      }

      @Override
      public int compareTo(Book obj){
        return this.publishDate.compareTo(obj.publishDate);
      // 自分の最初書いた回答は下のもの。DateクラスがcomparaToを実装しているから、それを利用する?
      //   if(this.publishDate < obj.publishDate){
      //     return -1
      //   } 
      //   if(this.publishDate > obj.publishDate){
      //     return 1;
      //   }
      //   return 0;
      }

      @Override
      public Book clone(){
        Book bookCloned = new Book();
        bookCloned.title = this.title.clone();
        bookCloned.comment = this.comment.clone();
        bookCloned.publishDate = (Date) this.publishDate.clone();
        return bookCloned;
      }

    }

 


    
  }
}