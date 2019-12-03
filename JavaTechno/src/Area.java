
 import java.util.Scanner;
class Area{
	
	 public static void main(String [] args)
	{
		System.out.println("------Program to calculate the Volume-------");
	    System.out.println(" Enter Your Choise :-   \n  1: circle\n  2: rectrangle \n 3:square ");
                      Scanner sc= new Scanner(System.in);
                      int choise= sc.nextInt();

           float area=0.0f, pai=3.141011f,  radi;           
  
	 switch(choise)
                 {
                         case  1 :
                          {
                              System.out.println("Enter The radious : ");
                              radi=sc.nextFloat();
                              area=(pai*radi*radi);     
                            }
   break;
				 
case 2:

{           System.out.println("Enter the Length : ");
                float lenght=sc.nextFloat();
              System.out.println("Enter the hight  :");
        float   hight;	
	 hight=sc.nextFloat();
         area=(length*hight);

  } break;
 
case 3:
{         

              System.out.println("Enter the hight  :");
                                 float hight;
			 hight=sc.nextFloat();
      area=hight*hight;

     } break;
default :
{
  System.out.println("Invlide Case");

}
 

                  }

    String output= String.format("%.1f",area);
System.out.println("\t\tarea= "+output +"\n\n\n");
		
	
	}	
	
	
}