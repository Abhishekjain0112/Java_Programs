import static java.lang.System.out;

class MyThread extends Thread 
{
	  public void run(){
		  MyThread.get();
	  }
	synchronized static void get()
	 {   
	     
		 try{
			  out.println("My thread Start");
			 
			 for(int i=1;i<=10;i++)
			     {
				 out.println("My thread class :"+i);
				 Thread.sleep(1000);
			     }	  
	        }
		  catch(Exception ex)
	     	 {
	 		 out.println("This is the exception in thread class ");
			 
		   }
		  
	 }
	 
	 
	 
}
class TestMyThread{
	
	public static void main(String...args) throws Exception{
	MyThread MT=new MyThread();
	MT.start();
//	MT.join();
	    
		out.println("My Main thread Started");
	for(int i=10;i>0;i--){
		out.println("Main Thread class:"+i);
		Thread.sleep(1000);
	}
	
	}
}