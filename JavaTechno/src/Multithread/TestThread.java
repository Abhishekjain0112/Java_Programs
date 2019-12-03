import static java.lang.System.out;

class NewThread extends Thread 
{
	 String name;
	NewThread(String name){
		this.name=name;
		start();//holds for all the objects 
	 //  out.println(name+" Constructor");
		
	}

	
	public void run()
	{
	 out.println(name+" start");
	
	    try{
			Thread.sleep(2000);//ms
			
		}
		catch(InterruptedException ex){
			
		}
		
		out.println(name +" Ended");
		
	}
}



class TestThread{
	 static public void main(String...arg){
		   
		    NewThread th1=new NewThread("First Thread");		
			NewThread th2=new NewThread("Second Thread");
//		  th2.start();
		 		 
  	    }
	
}