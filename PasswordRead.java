import java.io.Console;
public class PasswordRead {
public static void main(String args[]){
Console cvar=System.console();
System.out.print("Enter the Password :");
char[] pvar = cvar.readPassword(); //Reading the password in array
String password=String.valueOf(pvar); // converting the password Char array to String
System.out.println("Entered  Password is :"+password);
}

}