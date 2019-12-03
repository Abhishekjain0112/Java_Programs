import static java.System.out;

class StLogic{

  static int var;
 static MAX=100;
    
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
     StLogic sl=new StLogic();

         st.set(10);
  st.show();

}   

}

							