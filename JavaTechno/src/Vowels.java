import java.util.Scanner;
import static java.lang.System.out;


class Vowels
{

public static void main(String...ar)
 {
out.println("Enter the String");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();

int len=str.length();
int count=0;
char ch[]=  new char[len];
for(int i=0;i<len;i++)
 {
     ch[i]=str.charAt(i);
     int asc=(int)ch[i];
if((asc>=65&&asc<=90)||(asc>=97&&asc<=122))      
{
             if(ch[i]=='a'||  ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
              count++;
}

}
out.println("Total no of  Vowels= "+count +"\n  Consonents = "+(len-count) );
}

}