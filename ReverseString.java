import java.io.*;
import java.util.*;
import java.lang.*;
public class ReverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String in = sc.nextLine();
        byte[] byar= in.getBytes();
        byte[] result = new byte[byar.length];
        for(int i=0;i<byar.length;i++){
            result[i] = byar[byar.length-i-1];
        }
        System.out.println("Reverse:"+ new String(result));
    }
}