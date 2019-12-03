import java.util.Scanner;
import static java.lang.System.out;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.io.File;
import java.util.Date;
import java.io.PrintWriter;
class File1{
	
	public static void main(String...ar)throws Exception 
	{
		Scanner scan=new Scanner(System.in);
		 JOptionPane.showMessageDialog(null,"Hello  Enter the data You want to save");
		Date date=new Date();
		
	out.print("Enter Text Here :  ");
    
	String text=scan.nextLine();	
		FileWriter fw =new FileWriter("D:\\programs\\JavaTechno\\src\\Audiofile.txt",true);
		PrintWriter pw=new PrintWriter(fw);
	String str=date+text+"\n";
	pw.println(str);

	 JOptionPane.showMessageDialog(null,"To save the data press the Ok button ");
		
	fw.close();
		
		
	}
	
	
}

