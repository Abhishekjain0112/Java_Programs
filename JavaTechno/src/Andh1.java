import java.util.Scanner;
import static java.lang.System.out;

import javax.media.Player;
import  javax.media.Manager;
import java.io.File;

class Andh1{
public static void main(String...arg) throws Exception
          {  
		  
		  
	Player play=Manager.createRealizedPlayer(new File("D:\\programs\\JavaTechno\\src\\andh.wav").toURI().toURL());	  
	
    play.start();	
	Thread.sleep(5000);
	play.stop();
out.println("\n\n------Choose Andh Vishva-----\n1. A cat crossing your path\n 2. Hanging a lemon and seven green chillies in shops\n3. If a mirror breaks it brings seven years bad luck\n4. One should take a bath after attending any funeral\n5. Why Indians throw coins in holy rivers\n6.Opening an umbrella indoors brings bad luck"); 
         int choice;
             
	play.start();
			Thread.sleep(4000);
       play.stop();	

	   
          out.print("Enter Your Choice :");
 Scanner scan=new Scanner(System.in);         
choice= scan.nextInt();
          
   play.start();
 switch(choice)
		{
		case 1 : {
out.println("in olden days people used to travel by carts that were pulled by domesticated animals. When passing through forests at night, the carriage animals used to get scared and act chaotic when they sensed wild cats such as leopards, cheetahs, and tigers crossing their path. The travellers warned others not to proceed when a cat passes their path.");
}
 break;
	                         				
                       case 2: 
{             out.println("The cotton thread that passes through the lemon and the chillies absorbs the acids, vitamin C and the other nutrients present in it. Then, by slow vaporization, it is released into the air. This is said to have significant health benefits and our ancestors made it an essential part of ceremonies to increase its use");
   }            break;
			
        case 3:
{
out.println("In olden days, mirrors were extremely expensive and of also very low quality.");
}	break;
                                case 4:
{                         out.println("When a person dies, the body starts to decompose. This is basic biology. And when you attend a funeral, you are exposed to the germs, bacteria and the chemicals released by the body and present in the air due to decomposition.");
   }         break;
				
				
                           case 5:
             {                       out.println("n ancient times, the coins were made of copper, which is an essential element for our body’s well being. Rivers used to be the main source of drinking water. When the copper coins remained in the water for long, it became beneficial for those who drank it. Copper also helps to kill bacteria present in the water.");
              }                           break;

                           case 6:
             {      out.println("t was thought that opening an umbrella inside away from the sun insulted the God of the Sun and brought about bad luck. A second theory dates back to England in the 18th century. At that time, large umbrellas with metal spokes became popular. Opening these big umbrellas indoors could hurt someone or break a nearby object and lead to arguments with friends or family. So people avoided opening umbrellas inside, and the superstition grew from there.");
              }                           break;

                    default :
                       out.println("Invelide Choice.......!!!!!!");
                 }
				
	Thread.sleep(11000);			
				
				out.println("----------------THANK YOU ---------------------------");
       System.exit(0);
	   }

 }				
