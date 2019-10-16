
public class StringCheck {
  public static void main(String[] args){
    String s1 = "スッキリ";
    String s2 = "Java";
    String s3 = "java";
    String s4 = " ";
    if (s2.equals(s3)){
      System.out.println("s2 equals s3");
    } 
    if (s2.equalsIgnoreCase(s3)){
      System.out.println("s2 equals s3 without case");
    }
    System.out.println("the length of s1 is" + s1.length());
    if (s4.isEmpty() || s4.isBlank()){
      System.out.println("s4 is empty");
    }
  }
}