/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTC.fileProblem;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class QueryEnginSolution {
    public static void main(String[] args) {
         System.out.println("---welcome to file handling----");
   try{        
       File f1=new File("D:\\programs\\netbeansjava\\JavaPrograms\\src\\CTC\\fileProblem\\Collegemaster.csv");
       FileReader CollegeReader=new FileReader(f1); 
       File f2=new File("D:\\programs\\netbeansjava\\JavaPrograms\\src\\CTC\\fileProblem\\Usermaster.csv");
       FileReader userReader=new FileReader(f2);        
Scanner sc=new Scanner(System.in);
       String user[]={"UserId","UserName","Email","CTReference","CollegeId"};
       String college[]={"CollegeId","CollegeName","CityId","StateId"};
      char choise=sc.next().charAt(0);
      switch(choise){
          case 'C' :{
          String clmname=sc.next().trim();
          int indt= Arrays.binarySearch(college,clmname);
          String value=sc.next();
                BufferedReader clgBuffer=new BufferedReader(CollegeReader);
                String line,clgid="";
                String s[]=new String[4];
                     while((line=clgBuffer.readLine())!=null){
                     // System.out.println("   :"+line);   
                           s=line.split(",");
                           if(s[indt].equalsIgnoreCase(value))
                           {
                           clgid=s[0];
                           break;
                           }
                     }
                   if(clgid.equals(""))System.out.println("College Not Found");  
                BufferedReader userbuffer=new BufferedReader(userReader);
               String us[]=new String[5];
                while((line=userbuffer.readLine())!=null){
                  us=line.split(",");
                  if(us[4].equals(clgid)){
                      System.out.println(" "+us[0]+" "+us[1]+" "+us[2]+" "+us[3]);
                  }
           }
              userbuffer.close();
              clgBuffer.close();
          break;}
          case 'U' :{
          String clmname=sc.next().trim();
          int indt=-1;  
           for(String s:user){
               indt++;
               if(s.equals(clmname)){
                 break;
               }
           }     
              System.out.println("clname :"+clmname +":index  : "+indt+" user index :"+user[4] );
          String value=sc.next();
          BufferedReader clgBuffer=new BufferedReader(CollegeReader);
          BufferedReader userbuffer=new BufferedReader(userReader);   
          String line,clgid="";
                String us[]=new String[5];
                     while((line=userbuffer.readLine())!=null){
                     // System.out.println("   :"+line);   
                           us=line.split(",");
                           if(us[indt].equalsIgnoreCase(value))
                           {
                           clgid=us[4];
                           break;
                           }
                     
                     }
                   if(clgid.equals(""))System.out.println("College Not Found");  
                   else{System.out.println("clg id : "+clgid);}           
                 
                   line="";
                           String cs[]=new String[4];
                while((line=clgBuffer.readLine())!=null){
                  cs=line.split(",");
                  if(cs[0].equals(clgid)){
                      System.out.println(" "+cs[1]+" "+cs[2]+" "+cs[3]);
                  }
           }  
          break;}
      }
   }
   catch(Exception e){
       System.out.println("File  Not Fount : "+e);
   } 
   finally{
        System.out.println("End"); 
    }
    }
}
