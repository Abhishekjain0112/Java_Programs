class Test2{
int a,b;
   Test2(int m, int n)
{
   a=m;
   b=n;
}
   Test2(int m){
   a=m;
   b=50;
}   
   Test2()
{
    a=50;
    b=60;
}
    void add(){
    int c= a+b;
    System.out.println("\n\t\t Sum Of  " +a +"+" +b  +"=" +c);   
}
}

