/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author Entrar
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person persona1 = new Person("Eduardo", new Date(96, 05, 20));
        System.out.println(persona1.getName() + " tiene " + persona1.getAge());
    }
    
}
