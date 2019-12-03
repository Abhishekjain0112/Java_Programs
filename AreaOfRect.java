import java.util.Scanner;
 class AreaOfRect
{
    public static void main(String [] args)

  {
     double l,b,area;
     
      Scanner scan = new Scanner(System.in);
     
        System.out.print("\n\t Enter The Lenghth = ");
        l=scan.nextDouble();
        
        System.out.print("\n\t Enter The Breagth = ");       
        b=scan.nextDouble();
     area=l*b;
        
       System.out.println("\n\t Area Of Rectrangle =" +area);
    }



}