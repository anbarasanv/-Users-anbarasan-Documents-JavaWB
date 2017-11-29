//This program takes the n number of array input and suffle the user input order to make suffled array 
//Time complexity: O(n)
//Used Fisher–Yates shuffle Algorithm
import java.util.*;
public class ArrayShuffle{
    

  public static void main(String[] args){
        //Declarion of the variables
        int i,temp,temp1,pic;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        //Getting the size of the array 
        int n = sc.nextInt();
        
        //Declaring array list with user input lenght 
        ArrayList<Integer> al = new ArrayList<Integer>(n);
         System.out.println("Enter the values of the array: ");
         
         //This Loop adding the values to the array list
        for (i=0; i<n; i++){
            int value = sc.nextInt();
            al.add(value);
        }
            
        
        //This Loop displays the user input array list
        System.out.println("Entered the values of the array: ");
        for (i=0; i<n; i++){
            System.out.print(al.get(i)+" ");
        }
        
        //This Loop is Suffling the array 
        for (i=n-1;i>0; i--){
           temp=al.get(i);
           // finding the random possible index within the index range of the list
           pic =(int)Math.floor((i+1)*Math.random()); 
           temp1=al.get(pic);
           al.set(pic,temp);
           al.set(i,temp1);
        }
        //This Loop displays the final result of the suffled array list
        System.out.println("\nFinal Suffled values of the array: ");
        for (i=0; i<n; i++){
            System.out.print(al.get(i)+" ");
        }
        
    }
}
