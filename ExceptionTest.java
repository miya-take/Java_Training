public class ExceptionTest {
  public static void main(String[] args) {
    div(0);
  }

  static void div(int i) {
    if (i != 0) {
      System.out.println(3/i);
    } else {
      throw new IllegalArgumentException("Error");
    }
  }
}
