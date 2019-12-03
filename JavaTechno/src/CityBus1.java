import java.util.Scanner;
import static java.lang.System.out;

class CityBus1{

public static void main(String...arg){

out.println("-------------City Buse-----------------------------");
out.println("\n1.FareCharges   \n2.Driver Ditals  \n3.Bus Number As per route Number \n4.Monthly  And Yearly  City Bus Card and passes\n Select Your option= ");
Scanner scan= new Scanner(System.in);
int choice =scan.nextInt();
       
switch(choice){

case  1:{
out.println("   Route Number \t\t   Route Name  ");
out.println("   1  \t\t Rajwada > Lalbag > Mahunaka > RanjeetHanuman");
out.println("   2  \t\tRAJWADA  >Regal   >Highcourt > Palasia  ");
//out.println("10	\t\tRAILWAY STATION TO SATYA SAI BAUG");
//out.println("   13	\t\tRAJWADA - KHAJRANA - RAJWADA");

String source ,destination;

out.println("Enter route number ");
int routeNo=scan.nextInt();
out.println("Enter the Source :");

source=scan.nextLine();
source=scan.nextLine();
out.println("Enter the destination :");

destination=scan.nextLine(); 

float rate=(float)2.8,km=(float)0;
  if(routeNo==1){ switch(source){
          case "rajwada":{km++;}
          case "lalbag":{km++;    if(destination.equals("lalbag")) break;       }
          case "mahunaka":{km++;   if(destination.equals("mahunaka")) break; }
          case "ranjeethanuman":{km++;}break;
		 default : out.println("Invalid Source");
  } }
  else if(routeNo==2)
  {
	   switch(source){
          case "rajwada":{km++;}
          case "regal":{km++;    if(destination.equals("regal")) break;       }
          case "highcourt":{km++;   if(destination.equals("highcourt")) break; }
          case "palasia":{km++;}break;
		 default : out.println("Invalid Source");
  }
	  
  }
out.println("Total kilometers ="+km);
out.println("Total fare :"+km*rate);       

}break;

case 2:{
  out.println("  Driver Delails As per the bus number : \n Enter the Bus Number :");
 int busNo=scan.nextInt();
  if(busNo==1)
       out.println("Driver Name= Rajesh Sharma \n mobile Number : 8879954614");

else if(busNo==2)
       out.println("Driver Name= Ankit Sing Thakur\n mobile Number :8770715414");

else if(busNo==3)
       out.println("Driver Name= Abhay Patel \n mobile Number : 78795648244");

else if(busNo==4)
       out.println("Driver Name= Ali Khan \n mobile Number : 9827166140");

else if(busNo==5)
       out.println("Driver Name=Akshay \n mobile Number : 8877454014");
else
       out.println("Bus is not available");

}break;
case 3:{
	out.println("Enter route Number :");
	int rno=scan.nextInt();
	if(rno==1)
out.println(" Bus Number =9 \nroutenumber= 1  \n Rajwada > Lalbag > Mahunaka > RanjeetHanuman");
else if(rno==2)
out.println("   Bus Number =10 \nroutenumber= 2 \nRAJWADA  >Regal   >Highcourt > Palasia  ");

}break;
case 4:{
	out.println("Monthly  And Yearly  City Bus Card and passes :");
	out.println("Enter your age :");
	int age=scan.nextInt();
	if(age<=18)
	{
		out.println("You are teeager \n Monthly cost :200Rs\n Yearly Cost =2000Rs");
	}
else if(age>18 && age<=56)
	{
		out.println("You are Young \n Monthly cost :275Rs\n Yearly Cost =2200Rs");
	}
	else
	{
		out.println("You are Senior Citizen \n Monthly cost :175Rs\n Yearly Cost =175 0Rs");
	}
	
}break;
default : out.println("Invalid Choice!!");



}

}
}