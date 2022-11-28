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
public class RecursivoC {
    
    static long [] separaCombina(long a){
    long c[] = new long [2];
    if(a<10){
    c[0]=a;
    c[1]=0;
    return c;
    
    
    }
    if(a>10 && a< 100){
    c[0]=a/10;
    c[1]=a%10;
    return c;
    }
   
    long [] d = separaCombina(a/100);
    c[0]=d[0]*10+(a/10)&10;
    c[1]=d[1]*10+a%10; 
     return c;
   } 
    
    public static void main(String[] args) {
        System.out.println(separaCombina(54434));
    }
    
    
    }
    
    

