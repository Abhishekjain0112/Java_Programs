/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Darshan;

/**
 *
 * @author Abhishek
 */
public class Information {
   int rno;
    String name;
   String Address;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "Information{" + "rno=" + rno + ", name=" + name + ", Address=" + Address + '}';
    }
    
    
    
    
}
