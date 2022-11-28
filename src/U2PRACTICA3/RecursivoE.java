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
public class RecursivoE {
 
    static long E(int[]a){
    if(a.length==1){
    return a[0];
    }   
        
    if(a.length>1){
    return a[0]+E(subE(a,1,a.length-1));    
        
    }    
    return 0;
    }

    private static int[] subE(int[] a, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        System.out.println(subE(a, 45, 45));
    }
    
}
