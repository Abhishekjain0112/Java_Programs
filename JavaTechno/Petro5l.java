import java.util.Scanner;
class Petrol {
	
	//public Static void main(String args[])
	 public static void main(String [] args)
	{
		System.out.println("-------Program to find out the  days consumtion of petrol--------- ");
		float average,totalPerolFillUp,perDayUse;
		int days;
		System.out.print("Enter The Average of the vehicle =");
		 Scanner sc=new Scanner(System.in);
		 average=sc.nextFloat();
		System.out.print("Enter The totalPerolFillUp in vehicle =");
		 totalPerolFillUp=sc.nextFloat();
	
		System.out.print("Enter per Day Use of vehicle =");
		
		perDayUse=sc.nextFloat();
	
	days=(int)(totalPerolFillUp/perDayUse);
	
	System.out.println("The Petorl Take days to finished = "+days);
	
	}
	
}