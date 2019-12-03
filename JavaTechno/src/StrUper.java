import java.util.Scanner;
import static java.lang.System.out;

class StrUper{
	
	public static void main(String...ar)
	{
       out.println("Enter the string");
		Scanner scan=new Scanner(System.in);
		
		String str=scan.nextLine();
		int len= str.length();
		char ch[]=new char[len];
	
            for(int i=0;i<len;i++)
			{
				ch[i]=str.charAt(i);
				ch[i]-=32;
				out.println(ch[i]);
				
			}				
			String uper=new String(ch);
			out.println("UPER : "+uper);
	
	
	
	}

}