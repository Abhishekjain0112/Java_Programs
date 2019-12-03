import static java.lang.System.out;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.io.File;
//import javax.*;
import javax.media.Player;
import javax.media.Manager;

import java.util.Scanner;
import java.util.Date;
class Audio1{
	
	public static void main(String...ar) throws Exception 
	{
		Player play=Manager.createRealizedPlayer(new File("D:\\programs\\JavaTechno\\src\\audio1.wav").toURI().toURL());
		
		play.start();
	
	  Thread.sleep(5000);
	  play.stop();
	    //play.pause();
	out.println("-------------Welcome To the Audio Playar Program------------");
	
	    JOptionPane.showMessageDialog(null,"Hello Audio Playar Enter the data You want to save");
		Date date=new Date();
		play.start();
	out.print("Enter Text Here :  ");
     Scanner scan=new Scanner(System.in);
	String text=scan.nextLine();	
		FileWriter fw =new FileWriter("D:\\programs\\JavaTechno\\src\\Audiofile.txt",true);
		fw.write(date+text);
	Thread.sleep(4000);
	fw.close();
	
	
	System.exit(0);
}
}