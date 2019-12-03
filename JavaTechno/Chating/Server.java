import java.net.Socket;
import java.net.ServerSocket;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Server{
	public static void main(String...args)throws Exception{
		
		ServerSocket ss=new ServerSocket(2006);
		System.out.println("Server is ready ");
		
       Socket Socket=ss.accept();
	   InputStreamReader isr=new InputStreamReader(Socket.getInputStream());
		
		BufferedReader br= new BufferedReader(isr);
	
	while(true)
          	{
				String data=br.readLine();
				  if(data.length()==0)
				    break;
				System.out.println(data);
				
			}
		
	}
	
}