import static java.lang.System.out;
import java.util.Scanner;
class Picnic{


public static void main(String...arg)
   {  int choice;
        out.println("\n\n------ Choose  Range tile -----\n1->10km \n2->25km\n3->50km\n-------------"); 
             
            out.print("Enter Your Choice :");
 Scanner scan=new Scanner(System.in);         
 choice= scan.nextInt();
out.println("\n\n\n");
switch(choice)
   {
	   case 3:{ out.println("1-> PatalPani \n2->Choral \n3->Sitlamata Fall \n4->Other");
	   
out.print("Enter Your Choice :");         
int choice1= scan.nextInt();
     switch(choice1)
	   {
		   case 1 : out.println("Patal Pani \n \t Distance :35km \n Help Line Number :27474546");
		  break;
		   case 2 : out.println("Choral \n \t Distance :48km \n Help Line Number :2457845");
		  break;
		   case 3 : out.println("Sitlamata Fall \n \t Distance :50km\n Help Line Number :27474546");
		  break;
		  default :
		    out.println("\n\n NextList");

		  
	   }	 
	   
	   }
case 2 : 
      
		  { out.println("1->  Khajrana Ganesh Temple  \n2->Somanipuram Resort \n3->Other");
	   
out.print("Enter Your Choice :");         
int choice2= scan.nextInt();
     switch(choice2)
	   {
		   case 1 : out.println(" Khajrana Ganesh Temple  \n \t Distance :11km \n Help Line Number :27474546");
		  break;
		   case 2 : out.println("Somanipuram Resort \n \t Distance :17km \n Help Line Number :099070 68000");
		  break;
		   
		  default :
		    out.println("\n\n next List");

		  
	   }	 
	   
  }	   
  
  case 1 : 
      
		  { out.println("1-> Rajwada\n2->Krishna Pura Chhatri \n3->Lal Bagh Palace");
	   
out.print("Enter Your Choice :");         
int choice3= scan.nextInt();
     switch(choice3)
	   {
		   case 1 : out.println(" Rajwada\n \t Distance:1km\n Help Line Number :5544545");
	break;
	case 2 : out.println("Krinshna Pura Chhatri \n\t\t Distance:1.2km\nHelp Line Number :8878945");
	          	  break;
			  case 3: out.println("Lal Bagh Place \n\t  Distance : 3Km \n helpLine Number : 258745");
		             break;
		  default :
		    out.println("Invalid input");

		  
	   }	 
	   
  }	  break; 
	default :out.println("invlid Input ");   
	   
	   
	   
   }  

}


}