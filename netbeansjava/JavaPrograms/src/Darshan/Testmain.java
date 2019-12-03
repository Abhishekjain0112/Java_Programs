/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Darshan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class Testmain {
    
    public static void main(String[] args) {
        int rno;
        String name,address;
        List<Information> myArray = new ArrayList<Information>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Entry");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
              Information info=new Information();     
            System.out.print("roll no :");
           rno=sc.nextInt();
                 System.out.print("name :");
              info.setRno(rno);
           name=sc.next();
            info.setName(name);
          System.out.print("Address :");
           address=sc.next();
          info.setAddress(address);
          myArray.add(info);

          
          
          info=null;
        }
          System.out.println(" total informations are :------");
        System.out.println(myArray);
        
    }
}
