public class DemoWA {
    public static void main(String args[]){
        int arg;
        
       if(args.length>0)
       {
           try {
               arg=Integer.parseInt(args[0]);
               System.out.println("the number is" + args[0]);
           }
           catch(NumberFormatException e)
           {
               System.err.println(e);
               System.exit(1);
           }
       }
    }
}