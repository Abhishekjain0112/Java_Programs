/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

/**
 *
 * @author Abhishek
 */
public class MovePDFfile {
 
    
    
    
    public static void main(String[] args) throws Exception{
        
           File file=new File("D:\\Advanced JAVA\\File\\R1.pdf");
     // FileReader fr=new FileReader("D:\\Advanced JAVA\\File\\R1.pdf");
        FileInputStream fis=new FileInputStream("D:\\Advanced JAVA\\File\\R1.pdf");
        
        
        
        
        
        
        
        
        File fileCopy=new File("D:\\Advanced JAVA\\File");
        
        
        
        
        
        
        
        boolean success; 
        
        success = file.renameTo(new File(fileCopy,"resumCopy.pdf"));
        
     
          
        
        
    if (!success) {  
    System.out.println("File not moved ("+fileCopy+"dd"+")");
    } 
        
        
        
    }
    
    
    
    
    
    
    
    
}
