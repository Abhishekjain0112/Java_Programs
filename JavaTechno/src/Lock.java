import static java.lang.System.out;
class Lock{
public static void main(String...ar)throws Exception
{
    out.println("PassWord Protection program");
     String password=ar[0];  

    if(password.equals("abc123"))
     out.println("password is correct ");
 else {
       Runtime run=Runtime.getRuntime();
 run.exec("c:/Windows/System32/rundll32.exe user32.dll,LockWorkStation");
    }

}

}