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
public class IterativoF {

    private static int[] a;
    
    static int[] multiplos(int[] a, int b){
    int [] c= new int [2];
    for(int i=0;1<a.length; i++){
        if(a[i]%b==0){
        c[i]=a[i];
        
        }
        
    }
    
    return c;
    
}
    public static void main(String[] args) {
        System.out.println(multiplos(a, 44556));
    }
    
}