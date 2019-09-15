public class FinalTest {
  private static final String FINAL_CONSTRUCTOR = "test";
  public static void main (String[] args){
    FinalTest ft = new FinalTest();
    ft.FINAL_CONSTRUCTOR = "bbb";
  }
  final public void finalTest(){
    System.out.println("can't extends");
  }
}

