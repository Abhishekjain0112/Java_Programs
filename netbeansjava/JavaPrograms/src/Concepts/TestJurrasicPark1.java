/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class TestJurrasicPark1 {
    
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int r,c;
        r=sc.nextInt();
        c=sc.nextInt();
        System.out.println("enter values :");
       String park[][] =new String[r][c];
       int animal[]=new int[2];
        //,gate2[2],gate3[2],animal[2];
        
        
        int gates[][]=new int[3][2];
        
         for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                gates[i][j]=sc.nextInt();
            }
           
        }
        
        System.out.println("Row "+ r+"  Colum :" +c);
                int kk=0;
        for(int ga[]:gates){kk++;
           for(int g:ga){
               System.out.print("Gate no : "+kk +" : "+g);
             }
        }
 
              animal[0]=sc.nextInt();
        animal[1]=sc.nextInt();
    
        
        
        
        System.out.println("loop start:");
  /*   
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++){
        park[i][j]=sc.next();
      
      }
    } 
*/
    
//showPark(park); 
    
    }
      /*      
    static void showPark(String park[][]){
    for(String ss[]:park){
             for(String s:ss){
                 System.out.print(" "+s);
                 
             }System.out.println("");
    }
    
    }
    
    
    static boolean IsNextArear(int surce[], String park[][],char move, int r,int c )
    {
        
         
        
        
        return true ;
        
    }
    */
    
    
    
}
