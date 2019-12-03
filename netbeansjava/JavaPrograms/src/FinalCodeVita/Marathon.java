/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalCodeVita;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class Marathon {
    
    
    
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
         int N=sc.nextInt();
         int total =sc.nextInt();
         //int ii=total/2;
       // System.out.println(N+" "+total+" "+ii);
       
         int arr[][]=new int[N][total/2];
        
         for(int k=0;k<N;k++){
        
             for(int j=0;j<total/2;j++){
         int e1=sc.nextInt();
         int e2=sc.nextInt();
             arr[k][j]=e1+e2;
               }
             //for the odd input 
           if(total%2!=0){
           int e1=sc.nextInt();
               }
         int multi=sc.nextInt();
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
          
           int valuearry[]=new int[N];
           
           for(int k=0;k<N;k++){
              valuearry[k]=arr[k][j];
               }
       //fint the minimum of the array ; 
           
           int max=valuearry[0],indx=0;
           for(int l=0;l<valuearry.length;l++){
             if(max<valuearry[l])
             {
              max=valuearry[l];
              indx=l;
             }
                 
           }// we get the smallest index vavlue ;
           
           int smallest=valuearry[indx];
          //   System.out.println("Smallest inex  = "+indx+"  value :"+smallest);
          
             for(int i=0;i<valuearry.length;i++){
             if(valuearry[i]==smallest){
                winer[i]=winer[i]+1;
                if(!alist.contains(i)){
                  alist.add(i);
                }          
             }
           }
       
       }
     //////  winer[2]+=1;
       
       /* System.out.println("*---*");
        for(int i:winer){
            System.out.print(" "+i);
        }
         
        System.out.println(alist);
      */
       
       
       
       
       int max=0,ind=0;
              for(int l=0;l<winer.length;l++){
             if(max<winer[l])
             {
              max=winer[l];
              ind=l;
                 }
           }
             // System.out.println("Maximam time winner number : "+max);
              
              
              int c=0,indxx=-1;
          
            for(int i=0;i<winer.length;i++){
             if(winer[i]==max)
             {     c++;
                  if(c==1)
                      indxx=i;
             }
            }
          
            int allwiner[]=new int[c];int cc=0;
            for(int i=0;i<winer.length;i++){
             if(winer[i]==max)
             {
               allwiner[cc]=i;
             }
               } 
            
            
            
            if(c==1)
             //  System.out.println("Winer is cadidate no : "+ (ind+1));
                  System.out.println((ind+1));
             else{
              for(int ii:allwiner){
                  //System.out.println("Winer"+ (1+(alist.indexOf(ii))));
                 System.out.println((1+(alist.indexOf(ii))));
                 
                  break;
              }
               
             }
         // System.out.println(alist.);            
       
       
    }
    
    
    
    
    
}
