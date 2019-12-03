import java.util.Scanner;
import static java.lang.System.out;

class BeautyTips{

public static void main(String...arg){

out.println("-------------Welcome To Beauty Tips-----------------------------");
out.println("\n1.Teenager \n2.OldAge \n3.Groom \n4.Bride \n5.Woman \n6.Man\n Select Your Qption= ");
Scanner scan= new Scanner(System.in);
int choice =scan.nextInt();

switch(choice)
{
     case 1 : {        out.println("1. Natural \n2. Chamical");                              
                             choice=scan.nextInt();
                                   switch(choice){
                                  case 1:{
                                                    out.println("1. Banana and Egg Hair Treatment\n2. Simple Honey Face Mask");
                                                         choice=scan.nextInt();
                                                      switch(choice)
                                                                 {
                      case 1 :  out.println("Cost Is = 500 Rs");break;
                     case 2: out.println("Cost is = 450 Rs");break;
                    default : out.println("Invalide........");
                                                                   
                                                                 }
                                                        }break;

                               case 2:{
                             out.println("1. Body Scrub  \n2. Spa");
                                                         choice=scan.nextInt();
                                                      switch(choice)
                                                                 {
                      case 1 :  out.println("Cost Is = 750 Rs");break;
                     case 2: out.println("Cost is = 800 Rs");break;
                    default : out.println("Invalide........");
                                                                   
                                                                 }
                                                            }break;

                                     default : out.println("invalide.........");
                                           }


                         }break;
    case 2: {
   
 out.println("1. Natural \n2. Chamical");                              
                             choice=scan.nextInt();
                                   switch(choice){
                                  case 1:{
                                                    out.println("1. Banana Hair Treatment\n2. Old Simple Honey Face Mask");
                                                         choice=scan.nextInt();
                                                      switch(choice)
                                                                 {
                      case 1 :  out.println("Cost Is = 550 Rs");break;
                     case 2: out.println("Cost is = 600 Rs");break;
                    default : out.println("Invalide........");
                                                                   
                                                                 }
                                                        }break;

                               case 2:{
                             out.println("1. Massage Back and Nec  \n2. Body Spa");
                                                         choice=scan.nextInt();
                                                      switch(choice)
                                                                 {
                      case 1 :  out.println("Cost Is = 50 Rs");break;
                     case 2: out.println("Cost is = 800 Rs");break;
                    default : out.println("Invalide........");
                                                                   
                                                                 }
                                                            }break;

                                     default : out.println("invalide.........");
                                           }



}break;
    case 3: {}break;     
    case 4:{}break;
   case 5 :{}break;
   case 6:{}break;
default: out.println("Invalid Choise");
}


}
}