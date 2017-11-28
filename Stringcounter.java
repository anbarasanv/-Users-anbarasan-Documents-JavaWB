import java.io.*;
public class Stringcounter{
    public static void main(String[] args) throws IOException{
        
     File file = new File("/Users/anbarasan/Documents/Brackets java/a.txt"); //Creating File
     file.createNewFile();
     FileInputStream filestr= new FileInputStream(file);//making connection to the file
     InputStreamReader input = new InputStreamReader (filestr); // creating input stream reader
     BufferedReader reader = new BufferedReader(input); //creating Buffered reader
        
        String line;
        
  int  countword =0;
  int  sentence =0;
  int  charcount =0;
  int  paracount=1;
  int  spacecount=0;
        
while((line=reader.readLine()) != null){
    if(line.equals("")){
        paracount++;
    }
    if(!(line.equals(""))){
        charcount +=line.length();
        
        String[] wordlist = line.split(" ");
        countword += wordlist.length;
        spacecount += countword-1;
        
        String[] sentencelist = line.split("[!?.:]+");
        sentence =+sentencelist.length;
    }
}
   
        
       
       System.out.println("Totel number of word : "+countword);
       System.out.println("Totel number of sentence:  "+sentence);
       System.out.println("Totel number of charecter: "+charcount); 
       System.out.println("Totel number of paparagraph : "+paracount); 
       System.out.println("Totel number of space : "+spacecount);
        
       
        
    }
}