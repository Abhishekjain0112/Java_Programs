import java.util.Scanner;
import static java.lang.System.out;
class See <kuch ,bhi>
{
	kuch a;
	bhi b;
	
	void set(kuch a1,bhi a2)
	{
		a=a1;
		b=a2;	
	}

	void get()
	{
		out.println("  "+ a +"  "+b);
	}
	
	
	}
	
	class Gen{
		public static void main(String...ar)
		{
			See s=new See();
			s.set("abhi",89);
			s.get();
	
		s.set(89.5,89);
			s.get();
			
	
		}
		
	}