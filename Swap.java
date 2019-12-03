import java.util.Scanner;
class Swap{
  public static void main (String [] args)
{
    int a,b;
   Scanner scan = new Scanner(System.in);
   
    System.out.print("Enter A =");
    a= scan.nextInt();

    System.out.print("Enter B=");
    b= scan.nextInt();
    
    a=a+b;
    b=a-b;
    a=a-b;
   
   
  System.out.println("\n\t A=" +a);
  System.out.println("\n\t B=" +b);
}
}