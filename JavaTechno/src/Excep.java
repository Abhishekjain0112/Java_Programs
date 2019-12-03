import static java.lang.System.out;
import java.util.Scanner;

class EnglishMarksException extends RuntimeException 
{
	  EnglishMarksException()
	  {
		  
	  }
	
}

class HindiMarksException extends RuntimeException 
{
	HindiMarksException()
	{
		
	}
	
}

class Marks {
	
	static void getMethod(){
		Scanner scan= new Scanner(System.in);
		out.println("Enter the marks of ENGLISH = ");
		
		float engMarks=scan.nextFloat();
		if(engMarks<0 || engMarks>100)
		{
		     	EnglishMarksException ex= new EnglishMarksException();
				throw ex;
				
			
		}
		else{
			
			out.println("Thats Good!!!!!!!!!!");
			
		}
		
		out.println("Enter the Marks of Hindi  =");
		
		   float hinMarks=scan.nextFloat();
		   
		  if(hinMarks<0||hinMarks>100)
		  {
			  HindiMarksException ex= new HindiMarksException();
			  throw ex;
			  
		  }
		else{
			out.println("Thas Good No Exception");
		}					
	}	
}


class Execp{
	
	public static void main(String...args){
		  Marks ref=new Marks();
	       try{
			   ref.getMethod();
			   
		   }
		   catch(EnglishMarksException | HindiMarksException ex)
		   {
			   ex.printStackTrace();  //desplay exception
     out.println("Marks not in range !!!!!!!!!!!!!!!!!!!!!!");		  
		  }
		   
		   finally{
			   out.println("The Finally!!!!!!!");
		   }
		
	}
	
}
