public class StringSearch {
  public static void main(String[] args) {
    String s1 = "Java and JavaScript";
    if(s1.contains("Java")){
      System.out.println("s1 contains 'Java' ");
    }
    if(s1.endsWith("Java")){
      System.out.println("s1 endwith 'Java'");
    }
    System.out.println("s1で最初に文字列Javaが登場する位置は" + s1.indexOf("Java"));
    System.out.println(("s1で文字列Javaが最後に登場する位置は" + s1.lastIndexOf("Java")));
  }

}