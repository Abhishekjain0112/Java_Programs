import static java.lang.System.out;

class StLogic{

  static int var;
 static int MAX=100;
    
     void set(int var)
    { this.var=var; 
   show();
}

static void show()
{
  out.println(var+"         "+MAX);
}

}

class StaticPro{

    static public void main(String...arg){
     StLogic st=new StLogic();
     StLogic st1=new StLogic();

         st.set(10);
     st.set(30);                 
  st.show();

}   

}

							