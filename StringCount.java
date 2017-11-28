import java.util.Scanner;
import java.util.Arrays;
public class StringCount {
    /*public static String sort(String input){
        //covert string to char array
        char[] temp = input.toCharArray();
        //sorting the array
        Arrays.sort(temp);
        return new String(temp);
        
    }*/
    
public static void countString(char[] input, int len){
    int j,i,flag=0,k;
    int[] result;
    result = new int[26];
    for(i=0; i<len; i++){
        int x = (int)input[i];
        int count =0;
        for(j=65; j<=90; j++)
        {
            
            if(x==j)
            {
             result[count]=result[count]+1;
             
             break;
             
            }
            count++;
        }
        
        
    }
    
    for(k=65;k<=90;k++){
        char a = (char)k;
        if(result[flag]!=0){
            System.out.println("Number of "+a+" : "+result[flag]);
        }
        flag++;
    }
    
    }
    
    public static void main(String[] anbu){
      
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String input = scan.nextLine();
        //String output = sort(input);
        String send = input.toUpperCase();
        String  post = send.replaceAll(" ","");
        int len = post.length(); 
        System.out.println();
        System.out.println("You have Entered : "+send);
        System.out.println("The Totel number of letter's in the String : "+len);
        char[] unstr = post.toCharArray();
        countString(unstr, len);
        
        
    }
    
    
}

