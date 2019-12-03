/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalCodeVita;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class BottelNacks {
   
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<num;i++){
            arr.add(sc.nextInt());
        }
        int i=0,j=1,count=0;
        Collections.sort(arr);
        
        
        while(true){
    
            int siz=arr.size();
            int c=0;
           
            
            for(int aa:arr){
              int a=arr.get(0);
              if(a==aa)c++;
               }
             if(siz==c)break;
          count=0;
            if(arr.size()==1)break;
       if(j>=arr.size())
       {
          i=0;
          j=i+1;
       
       }
       int e1=arr.get(i);
       int e2=arr.get(j);
       
       if(e1==e2){
        i++;j++;
        count++;
        continue;
       }
       if(e1<e2){
         arr.remove(i);
       count++;   
       continue;
       } 
       if(count==0)break;
       
       } 
   
       // System.out.println(arr);
        System.out.println(arr.size());
    }
 
}
