public class MemberClass {
  public static void main(String[] args){
    Outer.Inner ic = new Outer.Inner();
  }

}
 
class Outer {
  int outerField;
  static int outerStaticField;
  static class Inner {
    void innerMethod(){
      outerStaticField = 10;
    }
  }

  void outerMethod() {
    Inner ic = new Inner();
  }

}
