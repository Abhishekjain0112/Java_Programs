package myclasses;
import static java.lang.System.out;

public class DemoJar{

public static void main(String...arg){

A ref=new B();
   ref.show();

A ref1=new C();
ref1.show();

// or 

A ref2[]= {new B(), new C()};
for(int i=0;i<ref2.length;i++)
  {
        ref2[i].show();
  }

}


}