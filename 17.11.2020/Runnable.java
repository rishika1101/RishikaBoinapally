import java.io;
class MultithreadingDemo {
	public static void main(String[] args) {
		class MultithreadingDemo extends Thread{  
			  public void run(){  
			    System.out.println("My thread is in running state.");  
			  }   
			  public static void main(String args[]){  
			     MultithreadingDemo obj=new MultithreadingDemo();   
			     obj.start();  
			  } 
		}
	}