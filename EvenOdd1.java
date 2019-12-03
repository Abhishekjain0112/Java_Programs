import java.util.Scanner;
class EvenOdd1{
  public static void main (String [] args){
       int a;
    Scanner scan = new Scanner(System.in);
    System.out.print("\n\t Enter the Number =");
    a=scan.nextInt();
 
  if(a%2==0){
    System.out.println("\t The Number " +a +" Is a Even Number");
}
else{
       System.out.println("\t The Number " +a +" is Odd Number");

}
   
}
}