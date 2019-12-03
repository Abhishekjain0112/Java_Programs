/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalCodeVita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class MarathonNext11 {
    
  public static void main(String[] args)throws IOException{

      //Scanner sc=new Scanner(System.in);

         BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
      
      
      int N=Integer.parseInt(br.readLine());
         int total =Integer.parseInt(br.readLine());
          
     if((0<N&&N<101)&&(0<total&&total<101)){      
//int ii=total/2;
       // System.out.println(N+" "+total+" "+ii);
       
         int arr[][]=new int[N][total/2];
        
         for(int k=0;k<N;k++){
        
             for(int j=0;j<total/2;j++){
         int e1=Integer.parseInt(br.readLine());
         int e2=Integer.parseInt(br.readLine());
             arr[k][j]=e1+e2;
               }
             //for the odd input 
           if(total%2!=0){
           int e1=Integer.parseInt(br.readLine());
               }
         int multi=Integer.parseInt(br.readLine());
         int sum=0;
         for(int i=0;i<total/2;i++){
         sum=sum+arr[k][i]*multi;
           arr[k][i]=sum;
         }
             
         }
         
       // System.out.println("**********");
        /*for(int ii[]:arr){
          
            for(int i:ii){
                System.out.print(" "+i);
            }System.out.println("");
        }*/
        //here is in the main ******;again  
      int winer[]=new int[N];
     
      ArrayList<Integer> alist=new ArrayList<>();
     
      
       for(int j=0;j<(total/2)-1;j++){
          
           
           int maxkk=arr[0][j];
           for(int k=1;k<N;k++){
              if(maxkk<arr[k][j]){
                maxkk=arr[k][j];
              }
             }
           
          for(int k=1;k<N;k++){
              if(maxkk==arr[k][j]){
                   winer[k]+=1;
                   alist.add(k);
              }
             }
           
       }
       
       int c=0,ind=-1,max=winer[0],findx=0,find=0;
         
       for(int i=1;i<winer.length;i++)
          {
             if(max<winer[i]){
               max=winer[i];
               findx++;
                 if(findx==1){find=i;}
             }
          }
       
        for(int i=0;i<winer.length;i++){
                if(max==winer[i]){
                  continue;
                }          else {
                   boolean b=alist.remove(new Integer(i));
                     }  
        } 
           System.out.println(alist.get(0)+1); 
       //fint the minimum of the array ; 
         
      
       
       }
      
         // System.out.println(alist.);            
    }  
            
            
    }
    
    
    
    
    
