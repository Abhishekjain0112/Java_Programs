import java.awt.Frame;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.Label;
import java.awt.Choice;
import java.awt.List;
import javax.media.Player;

class SwgDemo extends Frame implements WindowListener
{
	SwgDemo()
	{
		setLayout(new FlowLayout());
		Button btn=new Button("Click");
		Label lb=new Label("Name");
		TextField tf=new TextField(20);
        TextArea ta=new TextArea(10,10);
        Checkbox cb1=new Checkbox("Female");
		Checkbox ch2=new Checkbox("Male");
		
		List lt=new List(3,true);
		lt.add("HardWare");
		lt.add("Software");
	    lt.add("Testing");
		
		Choice ch =new Choice();
		ch.add("Select City");
		ch.add("Indore ");
		ch.add("Ujjain");
			
			add(btn);
add(lb);
		add(tf);
		add(ta);
		add(cb1);
			add(ch2);	
			add(lt);
			add(ch);
			
			setVisible(true);
			
			setSize(500,500);
			setBackground(Color.pink);
		   setForeground(Color.blue);
		addWindowListener(this);
		
	}
	
	static public void main(String...arg) throws Exception
	   {
		   new SwgDemo();
		   
	   }
	
	public void windowClosed(WindowEvent e)
	{
	}
	public void windowClosing(WindowEvent e)
	{
	System.exit(0);//it shut down JVM
	//dispose();//used to close only Frame/JFrame
	}
	public void windowActivated(WindowEvent e)
	{
	}
	public void windowDeactivated(WindowEvent e)
	{
	}
	public void windowIconified(WindowEvent e)
	{
	}
	public void windowDeiconified(WindowEvent e)
	{
	}
	public void windowOpened(WindowEvent e)
	{
	}
	
	
}
