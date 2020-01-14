import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class Jvm {
  public static void main(String[] args) {
    // 1起動すべきクラスのFQCN,起動仕方を非メスもじEorI
    Class<?> thisClass = Jvm.class;
    System.out.println(thisClass.getName()); //

    // 2 メモリの取得
    long memorySpace = Runtime.getRuntime().totalMemory();
    System.out.println(memorySpace);

    // 3 全てのメソッドを表示する
    Field[] allMethod = thisClass.getDeclaredFields();
    Arrays.stream(allMethod).forEach(field -> System.out.println(field));
    Method mainMethod = thisClass.getDeclaredMethod(main, string);

    if(mainMetho Method.){

    }

    


    // 1
    // 1
    // 1
    // 1
    // 1
    // 1
    
  }
}