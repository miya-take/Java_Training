import java.util.Iterator;

public class BookShelf implements Aggregate{
  private Book[] books;
  private int last = 0;
  // 本棚の所蔵可能数を指定
  public BookShelf(int maxsize){
    this.books = new Book[maxsize];
  }
  // 本を追加するメソッド
  public Book getBookAt(int index){
    return books[index];
  }
  // 本を追加するメソッド
  public void appendBook(Book book){
    this.books[last] = book;
    last++;
  }
  public int getLength(){
    return last;
  }
  public Iterator iterator(){
    return new BookShelfIterator(this);
  }
}