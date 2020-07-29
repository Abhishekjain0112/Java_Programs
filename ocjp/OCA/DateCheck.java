/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCA;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Abhishek
 */
public class DateCheck {

    
    public static void main(String[] args) {
        
        LocalDate d1=LocalDate.now();
        LocalDate d2=LocalDate.of(2012, 2, 29);
        LocalDate d3=LocalDate.parse("2019-01-23", DateTimeFormatter.ISO_DATE);
        
        
        System.out.println(" D  :"+ d1);
        
        System.out.println(" D  :"+ d2);
        
        System.out.println(" D  :"+ d3);
        
        
        
    }
    
}
