public class Calculator implements CalcIntf{

public int add(int a,int b){
int r=a+b;
  return(r);
}
public int sub(int a,int b){
int r=a-b;
return r;
}

public static void main(String [] agrs){

Calculator c= new Calculator();
  int s=0;
  s=c.add(12,40);
System.out.println("\t\t The Result Of Addition = " +s);
  s=c.sub(50,38);
System.out.println("\t\t The Subtraction is = "+s);
}

}