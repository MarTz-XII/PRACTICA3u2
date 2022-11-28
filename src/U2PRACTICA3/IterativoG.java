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
public class IterativoG {
    
    static int[] MezclaArr (int a[], int b[]){ 
     int[] c= new int [a.length+b.length];
     int indice = 0;
     for(int i=0; i <a.length;i++){
        c[indice]=a[i];
        indice+=2;
    }
    
     indice = 1;
     for(int i=0; i<b.length;i++){
     c[indice]=b[i];
     indice+=2;
         
     }
    return c; 
    
    }
    
    
}
