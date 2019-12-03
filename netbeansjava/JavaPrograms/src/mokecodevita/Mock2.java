/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mokecodevita;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class Mock2 {
    
        static String ones[]={"One", "Two", "Three", "Four" ,"Five", "Six" ,"Seven" ,"Eight","Nine",};
        static String onesones[]={"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        static String tanse[]={"Ten","Twenty","Thirty","Fouty","Fifty","Sixty","Seventy","Eighty","Ninety" };
        static String hundread="hundred",thousand="thousand";
        
    
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        int num1 =scn.nextInt();
        int num2=scn.nextInt();
        
        System.out.println(name(num1));
        System.out.println(name(num2));
          
        
        
    }
    
    static String name(int n){
    
        int i,j,k=n,dig=0,f;
        String s="";
        while(k!=0){
        
         f=k%10;
         dig++;
         j=f*(int)Math.pow(10,dig-1);
         
        s=digname(j, dig, s);
         k=k/10;
        }
        
        
        return s;
        
        
        
        
        
    }
    
    static String digname(int n,int dig,String s){
          String name="";
     int j=n;
          
     if(dig>2){
      //   System.out.println("::: : "+j+" ::" +Math.pow(10,dig-1));
         
      j=j/(int)Math.pow(10,dig-2);
      
        // System.out.println(": : "+j);
     }
     
          switch(j){
          
          //case 00:name="Hundred";break;
          //case 0:name="Thousand";break;
          case 1:name+=ones[0];break;
          case 2:name+=ones[1];break;
          case 3:name+=ones[2];break;
          case 4:name+=ones[3];break;
          case 5:name+=ones[4];break;
          case 6:name+=ones[5];break;
          case 7:name+=ones[6];break;
          case 8:name+=ones[7];break;
          case 9:name+=ones[8];break;
              
         case 11:name+=onesones[0];break;
          case 12:name+=onesones[1];break;
          case 13:name+=onesones[2];break;
          case 14:name+=onesones[3];break;
          case 15:name+=onesones[4];break;
          case 16:name+=onesones[5];break;
          case 17:name+=onesones[6];break;
          case 18:name+=onesones[7];break;
          case 19:name+=onesones[8];break;
          
          
            case 10:name+=tanse[0];break;
            case 20:name+=tanse[1];break;
            case 30:name+=tanse[2];break;
            case 40:name+=tanse[3];break;
            case 50:name+=tanse[4];break;
            case 60:name+=tanse[5];break;
            case 70:name+=tanse[6];break;
            case 80:name+=tanse[7];break;
            case 90:name+=tanse[8];break;
 
    }
      
    
      if(n>99&&n<999)
          name+=" Hundred";
      if(n>999&&n<9999)
          name+=" Thousand";            

      name=name+" "+s;

      return name;
    }
    
}
