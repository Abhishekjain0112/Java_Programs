class Hotel {
    public void book() throws Exception {
        throw new Exception();
    }
}

public class SuperHotel extends Hotel  {
    public void book() {
        System.out.print("booked");
    }
    
    public static void main(String args[]) {
        Hotel h = new SuperHotel();
        h.book();
    }   
}