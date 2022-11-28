/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U2PRACTICA3;
//Practica3 B
/**
 *
 * @author Gus_m
 */
public class RecursivoB {
  
    static long combinacion (long a, long b){
    if(b==0){
        return a;
        
    }
    if(a == 0){
    return b;
    }
    
    if(a<10){
        return a*10;
    }
    if(b<10){
    return b;
    }
        return combinacion (a%10,b%10)+combinacion(a/10,b/10);
      
    }
    
     public static void main(String[] args) {
         System.out.println(combinacion(23345, 54573));
    }
            
    }
    
        
        
        
        
        
  
