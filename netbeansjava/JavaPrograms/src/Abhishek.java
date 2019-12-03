
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek
 */
public class Abhishek {
    	public static void main(String[] args) {
//		System.out.println("Hello World");

   Scanner sc=new Scanner(System.in);
    
    String s=sc.next();
    int date=Integer.parseInt(s.substring(0,2));
    int month=Integer.parseInt(s.substring(3,5));
        int i=month,j=date;
    String fdate=""; 
   
     l: for(month=i;month<=30;month++){
        // date=01;
         for(date=date;date<=60;date++){
            if(date<10)
                fdate="0"+date+":";
               else
                 fdate=date+":";  
                if(month<10)
                    fdate=fdate+"0"+month;
               else
                    fdate=fdate+month;
             //   System.out.println(fdate);
             if(fdate.charAt(0)==fdate.charAt(4) && fdate.charAt(1)==fdate.charAt(3))
             {
                 System.out.println(fdate);
                  break l;
             }
          
         } date=01;  
         
     }
    
    
	}
    
    
    
    
    
}
