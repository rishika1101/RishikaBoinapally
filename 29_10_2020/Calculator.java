import java.util.*;
 class Calculator{
public  static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter operator you want to perform (*,+,-,/)");
    String oper = s.nextLine();
	System.out.println("Enter first number");
	int numberOne = s.nextInt();
	System.out.println("Enter second number");
	int numberTwo = s.nextInt(); 
	
     
    
    int total = calcu(oper, numberOne, numberTwo); 
    System.out.println("Solution ="+total); 
}   

static int calcu(String oper, int numberOne, int numberTwo)
 {

    if (oper.equals("+"))
	{
        int total = add(numberOne, numberTwo);
        return total;
    }
	else if (oper.equals("-")) 
	{
        int total = sub(numberOne, numberTwo);
        return total;
    } 
	else if (oper.equals("*"))
	{
        int total = multi(numberOne, numberTwo);
        return total;
    } 
	else if (oper.equals("/")) 
	{
        int total = div(numberOne, numberTwo);
        return total;
    }
    System.out.println("Invalid Operator...");
    return -1;
}
static int add(int numberOne, int numberTwo) 
{
    return numberOne + numberTwo;
}
static int multi(int numberOne, int numberTwo)
 {
   return numberOne * numberTwo;
}
static int sub(int numberOne, int numberTwo) 
{
    return numberOne - numberTwo;
}
static int div(int numberOne, int numberTwo) 
{
    return numberOne / numberTwo;
}
}