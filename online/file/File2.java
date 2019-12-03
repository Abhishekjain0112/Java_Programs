import java.io.*;

class File2{

public static void main (String args[]) throws IOException
  {
        String str="This is file hendling in java ";
   FileOutputStream Fos=new FileOutputStream("javahendling.txt",true);
  
   try{
         byte b[];
       b=str.getBytes();
      Fos.write(b);
      

   
      }

finally{
Fos.close();

}
         
  }


}