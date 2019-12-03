import static java.lang.System.out;
import java.util.Scanner;
class FullForm{


public static void main(String...arg)
   {  int choice;
        out.println("\n\n------Full Forms   Choose-----\n 1->AM \n 2->PM \n3->PDF\n4->GMT\n5->IST\n6->DVD\n7->CD\n8->GIF\n9->JPEG\n10->BMP\n11->MP4\n12->3GP\n13->AVI"); 
             
            out.print("Enter Your Choice :");
 Scanner scan=new Scanner(System.in);         
choice= scan.nextInt();

                switch(choice)
                   {
                  case 1 : out.println("Anti Meridiem"); break;
               case 2 : out.println("Post Meridien"); break;
     case 3 : out.println("Portable Document Format "); break;             
case 4 : out.println("Greenwich Mean Time");break;
case 5: out.println("Indian Standard Time");break;
case 6: out.println("Digital Versable Disc");break;
case 7:out.println("Compact Disc");break;
case 8: out.println("Graphics Interchange Formate");break;
case 9:out.println("Joint Photographic Experts Groups");break;
case 10: out.println("Both Macs and Pcs");break;
case 11: out.println("Moving Picture Experts Group 4(MPEG)");break;
case 12: out.println("Third Generation Partnership");break;
case 13:out.println("Audio Video Interleaved");break;

               default : out.println("Invalid Choice");

             }

    }

}