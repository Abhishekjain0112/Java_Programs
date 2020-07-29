/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChef;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Abhishek
 */
public class Chef_and_String {
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int t =sc.nextInt();
         List<String> ls=new ArrayList<String>();
         while(t-->0){
         String s=sc.next();
         int l=s.length();
           if(l==1 || l==2){
           }else
           {
              String s1=s.substring(1,l-1); // s1=aaa  lf:aaacb :cbaaa
  
              if( (( " "+s1+s.charAt(l-1)+s.charAt(0))).equals((" "+s.charAt(l-1)+s.charAt(0)+s1) )){
              System.out.println("YES");
               }else
                 System.out.println("NO");  
           }  
         }
    }
}