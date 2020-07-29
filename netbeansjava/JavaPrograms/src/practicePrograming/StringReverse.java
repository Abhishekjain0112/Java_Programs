/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicePrograming;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class StringReverse {
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  
    //  run:
        /*
Give String as A Input :Abhishek jain is the best in the world he can do any thing whetever he wants
String reverse :  stnaw eh revetehw gniht yna od nac eh dlrow eht ni tseb eht si niaj kehsihbA
BUILD SUCCESSFUL (total time: 30 seconds)  
        */
        System.out.print("Give String as A Input :");
        String str=sc.nextLine();
        
        StringBuffer strbuff=new StringBuffer(str);
        strbuff.reverse();
        System.out.println("String reverse :  "+strbuff);
        
      
        
    }
            
    
    
    
}
