import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;

public class File {
 public static void main(String[] args) {
   try{
     new File().process();
   } catch (IOException e ){
     e.printStackTrace();
   }
 }

 public void process() throws IOException{
   final InputStream inStream = new FileInputStream("sampledata.txt");
   try {
     for (;;){
       final int readChar = inStream.read();
       // streamの終わりに達して読み込むデータがないばい
       if (readChar < 0 ) break;
       System.out.println(readChar);
     }
   } catch (Exception e) {
     //TODO: handle exception
   }
 }

}