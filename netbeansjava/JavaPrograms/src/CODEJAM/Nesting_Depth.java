/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODEJAM;
import java.util.Scanner;
/**
 *
 * @author Abhishek
 */
public class Nesting_Depth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
       for(int c=1;c<=t;c++){
       char chararr[]= sc.next().toCharArray();
        System.out.print("Case #"+c+": ");
          int l=chararr.length;
           for(int i=0;i<l;i++){
            char ch=chararr[i];     
          int temp=ch-'0';
          while(temp>0){
              System.out.print("(");
              temp--;
          }
          System.out.print(ch);
          if(i<l-1)
          {
          for(int j=i+1;j<l-1;j++)
          {
           if(chararr[j]==ch)
           {     i++;
            System.out.print(ch);
           }
          } 
           }
          if(i==l-2 && chararr[i+1]==ch)
          {    i++;
          
          System.out.print(ch);
          }
        temp=ch-'0';
          while(temp>0){
              System.out.print(")");
              temp--;
          }   
       } System.out.println(""); 
       }   
    }
}