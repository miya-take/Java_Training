public class StringExtract {
  public static void main (String args[]){
    String s1 = "Java programming                         ....";
    System.out.println("文字列s1の3文字目以降は、"+
      s1.substring(3)
    );
    System.out.println("文字列s1の3-8文字目は" +
      s1.substring(3, 8)
    );
    System.out.println("s1の3文字目は" + s1.charAt(3));

    System.out.println("文字列s1を大文字に切り替えます" + s1.toUpperCase());
    System.out.println("文字列s1を小文字にします" + s1.toLowerCase());
    System.err.println("s1lの空白を除去します");
    String S1DelSpace = s1.trim();
    System.out.println(S1DelSpace);
    System.out.println("s1も文字列javaをC++に切り替えます");
    String S1Replase = s1.replace("java", "C++");
    System.out.println(S1Replase);
  }
  
}
