class  A{
 int x;
 int y,z;
  A()
  {
	//  System.out.println("Start of the constructor A()");
	 // super();
	  this(10,20);
	  System.out.println("End of the constructor A()");
  }
  A(int x,int y){
// System.out.println("Start of the constructor A(int a,int b)");
 
  this(x,y,30);
	  this.x=x;
	  this.y=y;
	  
	  System.out.println("End of the constructor A(int a,int b)");
  }
 A(int x,int y,int z){
	    super();
		System.out.println("Start of the constructor A(int a,int b,int c)");
	  this.x=x;
	  this.y=y+50;
	  this.z=z;
	  
	  System.out.println("End of the constructor A(int a,int b,int c)");
  }  
  
}


 class InheritanceConcept {

    
    public static void main(String args[]) {
        A a = new A();
        System.out.println("Value of a ="+a.x);
        System.out.println("Value of b ="+a.y);
        System.out.println("Value of c ="+a.z);
    }   
}