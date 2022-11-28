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
public class RecursivoG {
    
    static int [] mezcla(int a[], int b[]){
   
    if(a.length==0 && b.length>0){
    return b;
    }
    if(b.length==0 && a.length>0){
    return a;
        
    }
    if(a.length==0 && b.length==0){
    return new int[0];
    }
    int s[] = new int[1];
    s[0] = a[0];
    int[] z= new int [1];
    z[0] = b[0];
    return concatenar(concatenar(s,z), mezcla(subArreglo)(a,1,a.length-1),subArreglo(b,1,b.length-1)));
    
    
    }
    
    
}
