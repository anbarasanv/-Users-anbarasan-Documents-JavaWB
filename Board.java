import java.text.DecimalFormat;
public class Board {
   
    public static void main(String[] anbu){
      
        int e = 123345;
        DecimalFormat df = new DecimalFormat("####");
        String str = df.format(e);
        String str1 = Integer.toBinaryString(e); 
        String str3 = Integer.toString(e);
        int str2 = Integer.parseInt(str3,2);
        
        System.out.println(str+" "+str2+" "+str3);
        
        }
    }





