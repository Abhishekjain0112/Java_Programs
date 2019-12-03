import static java.lang.System.out;
class A{
	void show()
	{
	   out.println("I am of class A");	
	 	
	}
}
	interface B{
		void show();
		
	}
	interface B1 extends B{
		void show1();
		
		
	}
	
	class C extends A implements B1{
		
		public void show(){
			super.show();
			out.println("I am interface B");
					
		}
		
		public void show1()
		{
	  		
         out.println("I am the show1 of interface B1");  
		
		}
	
	    void get(){
			out.println("I am of class C");
			
		}
	
	}
	
class InterMain{
	static public void main(String...arg){
		 
		    C ref=new C();
			ref.show();
			ref.show1();
			ref.get();
			
		
	}
	
}
	
	
	