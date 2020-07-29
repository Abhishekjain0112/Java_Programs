/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicePrograming;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class AmazonString {
 
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next(); //input
        String protp="",domainname,contx;
        int ixd=0; //start index of domain 
        if(s.indexOf('h')==0)
         {protp="http";
         ixd=4;
         }
         else if(s.indexOf('f')==0)
         {protp="ftp";
          ixd=3;
        }
     int indxofRu=s.indexOf("ru");
        domainname=s.substring(ixd,indxofRu);
        contx=s.substring(indxofRu+2);
        String fullname=protp+"://"+domainname+".ru/"+contx;
        //return fullname;    //you write this line return 

        System.out.print(fullname);
        
        
        
        
    }
    
    
}
