import java.util.Scanner;  
    
interface  A{
	
void add();
	
default void add1(){ System.out.println("hello abhishek ");}
}
class B implements A{
	
	public void add(){
		System.out.println("Add method  is overwride");
	}
	public static void main(String...arg){
	     B ref=new B();
		    ref.add();
		 ref.add1();
	}
	
}