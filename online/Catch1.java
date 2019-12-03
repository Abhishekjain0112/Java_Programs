class Catch1{

public static void main(String args[]){


int a,d,b,c;
 
 a=156;
 b=2;

try
{ 
if(b==2)
throw(new ArithmeticException("By Two"));
c=a/b;
System.out.println("\t\tDevesion of A and B = "+c); 
 } 
catch(Exception e)
{

System.out.println("You cannot devide the number from Zero");

System.out.println("\t user Exception Works");
System.out.println(e);
}

d=a+b;
System.out.println("\t\tSome of A + B =  "+d);

}


}