/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/**
 *
 * @author Abhishek
 */

public class CopyPDF {
 
    public static void main(String[] args) throws Exception{
       
        /*
        File source = new File("D:\\Advanced JAVA\\File\\R1.pdf");  
        File destinationFile = new File("D:\\Advanced JAVA\\File\\destination\\R1CopyAbhishek.pdf"); 
       */ 
        
      File source = new File("D:\\Advanced JAVA\\File\\source\\6.jpg");
        
       FileInputStream fis=new FileInputStream("D:\\Advanced JAVA\\File\\source\\5.jpg");
      
         InputStream is=fis;
      
         
        
        File destinationFile = new File("D:\\Advanced JAVA\\File\\destination\\5copy.jpg");  
        
        
        copy(source, destinationFile);     
    }  
       
    public static void copy ( File source,  File target)  
        throws IOException {  
        FileChannel sourceChannel = null;  
        FileChannel targetChannel =null;  
        try {  
            sourceChannel =new FileInputStream(source).getChannel();  
            targetChannel=  new FileOutputStream(target).getChannel();  
        targetChannel.transferFrom(sourceChannel,0,sourceChannel.size());  
        }  
        finally {  
        targetChannel.close();  
        sourceChannel.close();  
        }  
        }   
    
}
