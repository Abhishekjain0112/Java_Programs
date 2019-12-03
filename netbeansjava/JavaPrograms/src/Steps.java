
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
public class Steps {
   
       public static void main(String argc[]) 
    { 
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(GetTotalCount(number)); 
    }
    public static int GetTotalCount(int number) 
    { 
        int[] arr = new int[1+number]; 
        arr[0] = 1; 
        arr[1] = 1; 
        arr[2] = 2; 
  
        for (int i = 3; i <= number; i++) 
            arr[i] = arr[i - 1] + arr[i - 2] 
                                + arr[i - 3]; 
     return arr[number]; 
    } 
    
    
}
