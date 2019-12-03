import java.util.Scanner;
import static java.lang.System.out;

class GST
{

public static void main(String...arg) {
   out.println("------------------------------- Welcome To   Mahaveer Kirana Store-------------------------------");
  out.print("Enter the number of items customer Purchase =");
Scanner scan=new Scanner(System.in);
int item=scan.nextInt();

double sum=0;

for(int i=0;i<item;i++)
{
out.println("Enter The product name : ");
String product=scan.nextLine();
 product=scan.nextLine();
out.println("Enter The Cost  :");
float cost=scan.nextFloat();
float gstCost= cost+((cost*18)/100);
sum=sum+gstCost;

out.println("\n\n\t\tProduct Name \t\tCost Without GST \t\t        Cost With GST");
out.println("\n\t\t"+product+"\t\t\t"+cost+"\t\t\t"+gstCost);

}
  String total = String.format("%.2f",sum);
      out.println("\n\n \t\t\t\tTotal Amount ="+total);

out.println("\n--------------------------------------------------------------------------------------");

}
}