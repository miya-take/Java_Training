package MonthTest;
import java.util.Calendar;




public class MonthSample {
    private void monthCount(){
            for (int i = 0; i <=12; i++){
                    System.out.println( i + "月");
            }
    }
    
    private static  String[] month = new String[] {
        "January", "Feburary",  "March"
    };
    
    public static void main (String[] args){
            // MonthSample app = new MonthSample();
            // app.monthCount();
            // for (String elm : month){
            //         System.out.println(elm);
            // }
            TypesafeEnumMonth typesafeEnumMonth = new TypesafeEnumMonth();
            TypesafeEnumMonth[] ms = TypesafeEnumMonth.values();
            for (TypesafeEnumMonth i : ms){
              System.out.println(i);
            }
            for (TypesafeEnumMonth i : ms){
              if (i == TypesafeEnumMonth.JANUARY){
                System.out.println("this month equals" + i);
              }
            }
    }
 }
