/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCA;

import java.awt.BorderLayout;
import java.util.Arrays;
import javafx.beans.binding.StringBinding;

/**
 *
 * @author Abhishek
 */
public class ArrayParameters {
    
    public static void  arryinc(int[] a){
   // super();
        for(int i=0;i<a.length;i++)
    {
      a[i]=a[i]+1;
    
    }
    }
    
    
   static  char c;
    public static void main(String[] args) {

        
        
        String  array[]={"seed","flower","plat","abhi","101","zz"};
      
         System.out.println(array[0] +"  " +array[1]+"   "+array[2]+"  " +array[3]+"   "+array[4]+"  " +array[5]);
        
        
        Arrays.sort(array);
     //   int result=Arrays.binarySearch(array,array[0]);
       
       // System.out.println(result);
         System.out.println(array[0] +"  " +array[1]+"   "+array[2]+"  " +array[3]+"   "+array[4]+"  " +array[5]);
        
        
        
        
        
        
//        System.out.println("  :  "+c);
//        String s="aaa";
//        
//        switch(s)
//        {
//            case "AAA":System.out.println("1");
//            break;
//            case "Aaa":System.out.println("2");
//            break;
//                default:System.out.println("3");
//                
//        }
               
        
        
        
        
//        
//        StringBuilder s=new StringBuilder("1z0");
//         String ss=new String("dsd");
//       //s.conc
//         ss.concat(ss);
//         
         
         
//        StringBuilder sb=new StringBuilder();
//        
//        System.out.println(sb);
//        
//        sb.append("world");
//        
//     sb.insert(0,"hello ");
////sb.append(0,"hello");
//        
//        System.out.println(sb);
//       
        
        
        
//          int ar1[]={2,4,6,8};
//      
// 
//          for(int x:ar1)
//          {
//              System.out.println(x);
//          }
              
              
//        70
//        int ar1[]={2,4,6,8};
//        int ar2[]={1,3,5,7,9};
//        
//        ar2=ar1;
//        for (int x : ar2) {
//            
//            System.out.println(x);
//        }
//      String b="true"; 
//        switch(b){
//            case "true":    System.out.println("w");
//        break;
//            default :
//         System.out.println("w");
//                        
//        }
//        
//        
        
        
        
        
        
//        int a[]={10,20,30};
//        arryinc(a);
//        
//        for(int b:a)
//        {
//            System.out.println(b+" ");
//          
//        }
//        
//       // arryinc(a[0],a[1],a[2]);
//     
//        System.out.println(a[0]+" , "+a[1]+" , "+a[2]);
//        
    }
    
    
    
}
