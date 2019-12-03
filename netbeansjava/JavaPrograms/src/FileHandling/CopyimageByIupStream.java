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

public class CopyimageByIupStream {
 
    public static void main(String[] args) throws Exception{
       
        /*
        File source = new File("D:\\Advanced JAVA\\File\\R1.pdf");  
        File destinationFile = new File("D:\\Advanced JAVA\\File\\destination\\R1CopyAbhishek.pdf"); 
       */ 
   
        //image
    /*  File source = new File("D:\\Advanced JAVA\\File\\source\\4.jpg");
    FileInputStream fis=new FileInputStream("D:\\Advanced JAVA\\File\\source\\4.jpg");
       InputStream is=fis;
      
         FileInputStream fs2=(FileInputStream)is;
        
        File destinationFile = new File("D:\\Advanced JAVA\\File\\destination\\4copy.jpg");  
          
      */  
        
        //pdf
        File source = new File("D:\\Advanced JAVA\\File\\source\\R1.pdf");
       FileInputStream fis=new FileInputStream("D:\\Advanced JAVA\\File\\source\\R1.pdf");
      
         InputStream is=fis;
      
         FileInputStream fs2=(FileInputStream)is;
        
        File destinationFile = new File("D:\\Advanced JAVA\\File\\destination\\Resume.pdf");  
        
        
        copy(fs2, destinationFile);  
        
        System.out.println("Fie is copyed ");
    }  
       
    public static void copy ( FileInputStream source,  File target)  
        throws IOException {  
        FileChannel sourceChannel = null;  
        FileChannel targetChannel =null;  
        try {  
            sourceChannel =source.getChannel();
            targetChannel=  new FileOutputStream(target).getChannel();  
        targetChannel.transferFrom(sourceChannel,0,sourceChannel.size());  
        }  
        finally {  
        targetChannel.close();  
        sourceChannel.close();  
        }  
        }   
    
}
