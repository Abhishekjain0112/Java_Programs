
 import java.util.Scanner;
class Volume {
	
	 public static void main(String [] args)
	{
		System.out.println("------Program to calculate the Volume-------");
	    System.out.println(" Enter Your Choise :-   \n  1: Sphere \n  2: Cone \n 3:Cylinder ");
                      Scanner sc= new Scanner(System.in);
                      int choise= sc.nextInt();

           float volume=0.0f, pai=3.141011f,  radi;           
  
	 switch(choise)
                 {
                         case  1 :
                          {
                              System.out.println("Enter The radious : ");
                              radi=sc.nextFloat();
                              volume=(4*pai*radi*radi*radi)/3;           
                            }
   break;
				 
case 2:

{           System.out.println("Enter the radious of cone : ");
                radi=sc.nextFloat();
              System.out.println("Enter the hight of cone :");
        float   hight;	
	 hight=sc.nextFloat();
         volume=(pai*radi*radi*hight)/3;

  } break;
 
case 3:
{         System.out.println("Enter the radious of Cylinder  : ");
          radi=sc.nextFloat();

              System.out.println("Enter the hight of Cylider :");
                                 float hight;
			 hight=sc.nextFloat();
      volume=pai*radi*radi*hight;

     } break;
default :
{
  System.out.println("Invlide Case");

}
 

                  }

    String output= String.format("%.1f",volume);
System.out.println("\t\tVolume = "+output +"\n\n\n");
		
	
	}	
	
	
}