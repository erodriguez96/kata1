/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Entrar
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1996, 5, 20);
        
        Person persona1 = new Person("Eduardo", date);
        System.out.println(persona1.getName() + " tiene " + persona1.getAge() + " años");
    }
    
}
