import java.util.Scanner;
import static java.lang.System.out;

class CityBus{

public static void main(String...arg){

out.println("-------------City Buse-----------------------------");
out.println("\n1.FareCharges   \n2.Driver Ditals  \n3.Bus Number As per route Number \n4.Monthly  And Yearly  City Bus Card\n Select Your option= ");
Scanner scan= new Scanner(System.in);
int choice =scan.nextInt();
       
switch(choice){

case  1:{
out.println("   Route Number \t\t   Route Name  ");
out.println("   15	\t\tLIG THIRAHA TO SANGAM NAGAR");
out.println("   6	\t\tRAJWADA TO PIPLIYAPALA");
out.println("10	\t\tRAILWAY STATION TO SATYA SAI BAUG");
out.println("   13	\t\tRAJWADA - KHAJRANA - RAJWADA");

choice =scan.nextInt();
   swich(choice){
          case 15:{out.println("Total fare : 20Rs");}break;
          case 6:{out.println("Total fare : 25Rs");}break;
          case 10:{out.println("Total fare : 15Rs");}break;
          case 13:{out.println("Total fare : 15Rs");}break;
          default : out.println("Invalid Choice!!");


             }
       

}break;

case 2:{
  out.println("  Driver Delails As per the bus number : \n Enter the Bus Number :");
 int busNo=scan.nextInt();
  if(busNo==1)
       out.println("Driver Name= Rajesh Sharma ");

else if(busNo==10)
       out.println("Driver Name= Ankit Sing Thakur");

else if(busNo==5)
       out.println("Driver Name= Abhay Patel");

else if(busNo==6)
       out.println("Driver Name= Ali Khan");

else if(busNo==9)
       out.println("Driver Name=Akshay");
else
       out.println("Bus is not available");

}break;
case 3:{


}break;
case 4:{}break;
default : out.println("Invalid Choice!!");



}

}
}