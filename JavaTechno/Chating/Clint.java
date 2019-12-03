import java.net.Socket;
import java.net.ServerSocket;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.PrintStream;

import static java.lang.System.out;
class Clint{
	
static public void main(String...arg)throws Exception
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter ip address");
	  String iPAddress=sc.next();
	  Socket s=new Socket(iPAddress,2006);
	  InputStreamReader isr=new InputStreamReader(System.in);
	 BufferedReader br=new BufferedReader(isr);
	  PrintStream ps=new PrintStream(s.getOutputStream());
	  while(true)
	  {
		  String data=br.readLine();
		  if(data==null)
			  break;
		  ps.println(data);
		  
	  }
	  
	  
	  
  }
	
	
}