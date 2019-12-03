import java.util.Scanner;
import static java.lang.System.out;

class Company{
	
	String name;
	int number;
	float year;
	
	void set(String nm,int num,float yr)
	{
		name=nm;
		number=num;
		year=yr;
	}

    public String tostring()
	{
		  return (getClass().getName() + "@" + Integer.toHexString(hashCode()));
	}
	
	public void loop()
	{
		for(int i=0;i<10;i++)
			out.println(Integer.toHexString(hashCode()));
	}

public String toString()
	{
		return " this is overwiter method toString name= "+name+"  number= "+ number+"year ="+year;
		
	} 	
 	
	public void finalize()
	{  
		out.println("Memory  is free!!!!  for the class :"+getClass().getName());
		
	}
	
}
class OPPs{
	
	public static void main(String...ar)
    {
		
		while(true){
		out.println("Start Frome Here");
		Company cmp=new Company();
		cmp.set("Abhi",2,5.6f);
		
		out.println(cmp);
		out.println("\n\t\t\t\t");
		
		System.gc();
		
	   Play play=new Play();
           play.set("PLAYAR",777,99.99f)	;
		out.println(play);
		
                             out.println("\n\n\t\t\t\t");
		
		//System.gc();
		out.println("END Frome Here");
		
		//out.println(cmp.tostring());
		//out.println(Integer.toHexString(hashCode()));
		//cmp.loop();
		}
				
		
	}

	
}





class Play{
	
	String name;
	int number;
	float year;
	
	void set(String nm,int num,float yr)
	{
		name=nm;
		number=num;
		year=yr;
	}

    public String tostring()
	{
		return (getClass().getName() + "@" + Integer.toHexString(hashCode()));
	}
	
	public void loop()
	{
		for(int i=0;i<10;i++)
			out.println(Integer.toHexString(hashCode()));
	}

public String toString()
	{
		return "Play Class methord= "+name+"  number= "+ number+"year ="+year;
		
	} 	
 	
	public void finalize()
	{  
		out.println("**********Memory  is free!!!!*****  for the class :"+getClass().getName());
		
	}
	
}