import java.util.Scanner;
import static java.lang.System.out;

class CompanyInfo
{
	public static void main(String...arg)
	{
	
out.println("----------------Company Criteria Software------------------------------------------------------------");
out.println("Number of companies \n 1 Google \n 2 Microsoft\n 3 Amazon \n--------");
out.println("Enter the choice : ");
Scanner scan =new Scanner(System.in);
int choice=scan.nextInt();
	
out.println("----Enter You Delails---- ");
out.println("Enter You name :");
String name =scan.nextLine();
    name =scan.nextLine();
      
	out.println("Enter You marks in 12 th :");
	float marks12= scan.nextFloat();
	out.println("Enter You CGPA of College :");
	float cgpa= scan.nextFloat();

switch(choice)
    {
		case 1 : if(cgpa>8.5 && marks12>90)
	             	{
						out.println("You are eligible for Google\n");

					}
                  else out.println("You Are Not Eligible For Google\n");		
		
	  case 2: if(cgpa>8 || marks12>80)
	          	{
						out.println("You are eligible for Microsoft\n");

					}
                  else out.println("You Are Not Eligible For Microsoft\n");		
				  
	 case 3: if(cgpa>7.5 || marks12>80)
	          	{
						out.println("You are eligible for Amazon\n");

					}
                  else out.println("You Are Not Eligible For Amazon");		
						  
				  
		
	}	
	
	
	}
}