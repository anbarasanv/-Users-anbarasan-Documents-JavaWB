import java.io.Console;
public class ReadFromConsole{
    public static void main(String args[]){
        Console cvar=System.console(); // Console variable declaration
        System.out.print("Enter the string : ");
        String svar=cvar.readLine();
        System.out.println("The Entered string is  : "+svar);
        
    }
}
