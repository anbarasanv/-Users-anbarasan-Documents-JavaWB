import java.util.Scanner;
import java.io.Console;
public class ScannerTest{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Console pas = System.console();
    System.out.print("Enter your name :");
    String name = sc.nextLine();
    System.out.print("Enter your Age :");
    int age = sc.nextInt();
    System.out.print("Enter your Gender :");
    char gender = sc.next().charAt(0);
    System.out.print("Enter your Password :");
    char[] pass = pas.readPassword();
    String paswd = String.valueOf(pass);
    if(paswd.equals("") && paswd!=null)
    {
        System.out.println("password is Nulls");
    }
    
    
    //Results :
    
    System.out.println("your name : "+" "+name);
    System.out.println("your Age : "+" "+age);
    System.out.println("your Gender : "+gender);
    System.out.println("your Password : "+paswd);
    
    
    
}
}
