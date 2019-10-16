public class StringTest {
    public static void main (String[] args){
        // 1-1
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i<=100; i++){
            sb.append(i+",");
            // sb.append(i).append(",");
            String s = sb.toString();
            String[] a = s.split(",")
        }

        // 1-2
        String fileName = "readme.txt";
        String folderName1 = "c:¥javadev";
        String folderName2 = "c:¥user¥";

        if(!folderName.matches(".¥¥")){
            folderName.replace("¥", "");
            // folderName += "¥¥";
        }
        String absolutePath = folderName + fileName;
        System.out.priintln(absolutePath);

        // 1-3
        // (1) [.*]
        // (2) A[0-9][0-9]{0} A¥d{1,2}
        // (3) U[A-Z]{3}






    }
}