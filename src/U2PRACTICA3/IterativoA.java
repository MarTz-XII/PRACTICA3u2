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
public class IterativoA {
    
   static long quitar (long n){
     long a=0;
     long b=1;
     while (n>0){
         long x = n %10;
         if(x !=3 && x != 5 && x !=7) {
         a = a+x*b;
         b=b*10;
         
         }
         n=n/10;
     }
     return a;  
       
   } 
    
    public static void main(String[] args) {
        System.out.println(quitar(18573967));
    }
   
}
