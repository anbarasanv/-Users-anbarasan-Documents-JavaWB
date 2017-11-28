import java.util.*;
public class Trailremzero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the number :");
        String str = sc.nextLine();
        str = removezero(str);
        int a = Integer.parseInt(str);
        System.out.println(a);
    }
    
    public static String removezero(String str){
        int i=0;
        while(str.charAt(i)=='0'){
            i++;
        }
            StringBuffer sb = new StringBuffer(str);
            sb.replace(0, i, "");
        return sb.toString();
        }
    }
