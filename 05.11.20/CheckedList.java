import java.io.*;
class File
 { 
   public static void main(String args[]) 
   {
    FileInputStream file = null; 
         File = new FileInputStream; 
    int k;
        while(( k = f.read() ) != -1) 
    { 
        System.out.print((char)k); 
    } 
    f.close();    
   }
}