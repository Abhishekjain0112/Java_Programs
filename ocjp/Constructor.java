class A{
	{
		System.out.println("A Class initialize block ");
	}
public final	 	A(){
		System.out.println("Default Constructor ");
		
	}
	A(int a){
		System.out.println("parametrize Constructor ");
		
	}
	
	
}

class Constructor {
   

    public static void main(String args[]) {

	A a=new A();

   }
   
   
   
}
