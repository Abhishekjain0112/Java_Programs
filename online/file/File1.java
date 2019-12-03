import java.io.*;
class File1{
public static void main (String args[]) throws IOException	
{
   char ch='A';
 FileOutputStream FOS = new FileOutputStream("Name in File");

   
try{
    System.out.println(ch);
    FOS.write((int)(ch));
       
  }
   finally{

   FOS.close();
}
}

}