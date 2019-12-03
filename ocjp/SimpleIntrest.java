
import java.io.*;
import java.util.*;
class SimpleIntrest {
    public static void main(String args[] ) throws Exception {

    	//Write code here

Scanner scan=new Scanner(System.in);
int c,b,si;
double a;


a=scan.nextDouble();


b=scan.nextInt();

c=scan.nextInt();

if((a<=1000 || a>=1) && (b<=1000 || b>=1) &&(c<=1000 || c>=1))
{
    
si=(int)Math.round((a*b*c)/100);    
    
    System.out.println(si);
}

   }
}