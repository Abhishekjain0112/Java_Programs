import java.util.Scanner;  
    
class Assert{  
 public static void main( String args[] ){  
  
  Scanner scanner = new Scanner( System.in );  
  System.out.print("Enter ur age ");  
    
  int value = scanner.nextInt();  
  assert value>=18:" wewe Not valid";  
  
  System.out.println("value is "+value);  
 }   
}  
  