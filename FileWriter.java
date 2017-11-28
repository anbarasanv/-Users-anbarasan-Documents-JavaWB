//Having Error Need to check out

import java.io.*;  
public class FileWriter{  
    public static void main(String[] args) {  
        try {  
            FileWriter w=new FileWriter("test.txt"); 
            w.write("I love my country");  
            w.close();  
            System.out.println("Done");  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}  


//Error : FileWriter.java:7: error: constructor FileWriter in class FileWriter cannot be applied to given types;
            