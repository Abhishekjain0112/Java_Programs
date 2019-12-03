
 
 import java.util.Scanner;
class AreaOfCircle{

public static void main(String [] args)
{  
    double r;
    double area=0.0;
	System.out.println("\n Enter The Radious=");
	Scanner scan=new Scanner(System.in);
	r=scan.nextDouble();
	
   area=3.14*r*r;
System.out.println("\n \t Area Of Circle of Radious "+ r + "is ="+ area);

scan.close();
}
}