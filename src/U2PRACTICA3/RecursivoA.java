/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U2PRACTICA3;

/**
 *
 * @author Gus_m
 */
public class RecursivoA {
    
    static long quitar (long n){
    long r = n%10;
    if(n<10){
        return n!=3 && n!=5 && n!=7 ? n:0;
        
        
    }
        
    if(r!=3 && r!=5 && r!=7){
        return r+ quitar (n/10)*10;
    }
    
    return quitar(n/10);
    }
    
    public static void main(String[] args) {
        System.out.println(quitar(764135907));
    }
    
}
