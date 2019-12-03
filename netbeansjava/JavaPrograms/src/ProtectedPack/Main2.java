/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProtectedPack;

/**
 *
 * @author Abhishek
 */
public class Main2 {
    
    
    public static void main(String[] args) {
        System.out.println("Main  2 ");

        String s="aaaaaaa"+new StringBuffer("  sssb");
        StringBuffer sb=new StringBuffer("123456789");
       
        //sb.insert(1,"aaaaa");
      //  sb.substring(7,10);
//        System.out.println(sb);         
  String a[][]=new  String[3][];
            
  a[0]=new String[]{"a","b"};
  
  a[1]=new String[]{"a","b","c"};
  
  a[2]=new String[]{"a","b","c"};
  
//  for(String[] xx:a)
//  {
//       for(String xxx:xx){
//           System.out.print(xxx);
//       }
//      System.out.println("");
//  }
//  
  
    for(int i=0;i<a.length;i++)
    {
       for(int j=0;j<a[i].length;j++)
       {
           System.out.println(a[i][j].toUpperCase());
       }
    }
  
  
    }

}
