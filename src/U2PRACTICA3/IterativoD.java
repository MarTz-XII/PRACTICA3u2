/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U2PRACTICA3;

import java.util.Scanner;

/**
 *
 * @author Gus_m
 */
public class IterativoD {
    
    public static void main(String[] args) throws Exception {
     Scanner entrada= new Scanner(System.in);   
        System.out.println("Dame una oracion: ");   
     String cadena = entrada.nextLine();
        System.out.println("La cadena sin modifica es: "+cadena);
        String cadenaCons = cadena.replaceAll("[a,e,i,o,u]", "");
        
        System.out.println("La cadena sin vocales es: "+cadenaCons);
        
        
    }
    
    
    
    
    
}
