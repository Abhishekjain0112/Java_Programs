/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HakerRank;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class Withoutloop {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
    
       // int n=sc.nextInt();
      
       prints(10); 
        
        
    }
    static int i=0;
    static int prints(int num){
       
        System.out.print(num+" ");
        if(num==0)i=1;
        if(i==1)return 0;
        prints(num-5);
        System.out.print(num+" ");
        return 0;
    }
    
    
    
            
}
