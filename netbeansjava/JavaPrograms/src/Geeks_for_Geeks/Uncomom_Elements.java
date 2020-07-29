/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geeks_for_Geeks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class Uncomom_Elements {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> al1=new ArrayList<Integer>();
        ArrayList<Integer> al2=new ArrayList<Integer>();
         ArrayList<Character> al=new ArrayList<Character>();
        al.add('e');
          int n=sc.nextInt();
          int m=sc.nextInt();
        
          for(int i=0;i<n;i++)
              al1.add(sc.nextInt());
          
          for(int i=0;i<m;i++)
              al2.add(sc.nextInt());
        
         ArrayList<Integer> al3=new ArrayList<Integer>();  
          
           for(int i=0;i<n;i++)
           {
           al3.add(al1.get(i));
           }
           
           for(int i=0;i<m;i++)
           {
           al3.add(al2.get(i));
           }
          int count=0;
           // int ii=0; 
          for(int ii=0;ii<n+m;ii++){
           
            if(al1.contains(al3.get(ii)) && al2.contains(al3.get(ii))  ){
            
            }
            else count++;           
           
          }
           System.out.println(count);
          
    }
            
}
/*
11 10
1 1 2 3 4 5 5 7 6 9 10
11 12 13 4 5 6 7 18 19 20
12

*/