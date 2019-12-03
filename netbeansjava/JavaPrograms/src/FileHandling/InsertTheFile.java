/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;

/**
 *
 * @author Abhishek
 */
public class InsertTheFile {
    
    
    
    public static void main(String[] args) throws Exception{
        
        FileReader fr=new FileReader("D:\\Advanced JAVA\\File\\ml.txt");
        FileInputStream fis=new FileInputStream("D:\\Advanced JAVA\\File\\ml.txt");
        
        
        
        
        //new file to write the file
        FileOutputStream fosnewfileToWrite=new FileOutputStream("D:\\Advanced JAVA\\File\\mlcpy1.txt");
        
        InputStream is=fis;
        
        
         BufferedReader br=new BufferedReader(fr);
       
       
         FileInputStream fis1=(FileInputStream)is;
       
        
        
        
        
      //  InputStreamR
        
        
        //   for(String ss:br.readLine())
        int i=0;
                int j=26;
               
                        //x s[]=br.lines();
                
               System.out.println("\n value of j : "+j); 
        
               
               //by this code we can read the whole file to the end 
               
               String s="   Hello Copy \n";
        i=br.read();
        byte b[];
        
        String nextline=System.getProperty("line.separator");
        
        
   while(i!=-1){
       
        s=br.readLine();
        b=s.getBytes();
   
        fosnewfileToWrite.write(b);
        fosnewfileToWrite.write(nextline.getBytes());
        
        
        System.out.println(s);        
   
        
        i=br.read();    
  
   }
   
       // System.out.println(s);     
   
   
        br.close();
        fr.close();
        
    }
    
    
}
