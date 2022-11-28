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
public class IterativoC {
    
    static String Separa (long a){
   long b=0 , c=0;
    int f=1;
    while(a>0){
     b+=a%10*f;
     a/=10;
     c+=a%10*f;
     a/=10;
     f=f*10;
        
    }
         
    return b+ " " + c;
 
    
    
    
}

    public static void main(String[] args) {
        System.out.println(Separa(3854375));
    }

}
