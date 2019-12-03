import java.util.Scanner;
import static java.lang.System.out;

class StrRev{
	
	public static void main(String...ar)
	{
		out.println("Enter the string");
		Scanner scan=new Scanner(System.in);
		
		String str=scan.nextLine();
		int len= str.length();
		//char ar[]=new char[len];
		int i,j, COUNT=0;
		len-=1;
		for(i=0,j=len;i<=(len/2);i++,j--)
		{
			if(str.charAt(i)==str.charAt(j))
			{ COUNT++;
			   out.println(str.charAt(i)+"   "+ COUNT  +"   "+str.charAt(j));
			}		
		
		}
		
	
	if(COUNT==(len+1)/2)
	out.println("String is palendron");
	else	
		out.println("Not is not palendrom");
		
}}