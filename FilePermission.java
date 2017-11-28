
//Program having Errors neeed to be check !!!

package com.javatpoint;  
  
import java.io.*;  
import java.security.PermissionCollection;  
public class FilePermission{  
       public static void main(String[] args) throws IOException {  
        String srg = "/Users/anbarasan/Documents/test/a.pdf";  
        FilePermission file1 = new FilePermission("/Users/anbarasan/Documents/test/-", "read");  
        PermissionCollection permission = file1.newPermissionCollection();  
        permission.add(file1);  
             FilePermission file2 = new FilePermission(srg, "write");  
             permission.add(file2);  
             if(permission.implies(new FilePermission(srg, "read,write"))) {  
             System.out.println("Read, Write permission is granted for the path "+srg );  
             }else {  
            System.out.println("No Read, Write permission is granted for the path "+srg);            }  
       }   
}  