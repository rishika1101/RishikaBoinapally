    import java.util.*;

    public class Amstrong 

    {

        public static void main(String[] args) 

        { 
    int c=0,a,temp;  
    int n=153;//It is the number to check armstrong  
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
	System.out.println("a=n%10");
	System.out.printf("'a' %d,a 'n' %d,n ");
	System.out.print("= "+a);
    n=n/10;  
	System.out.println(n);
	System.out.print(" /10");
	System.out.print("= "+n);
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
   }
   