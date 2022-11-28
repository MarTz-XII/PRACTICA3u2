/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U2PRACTICA3;
//ITERATIVOB Practica
/**
 *
 * @author Gus_m
 */
public class IterativoB {
    
    static long  Combina (long n, long m){
    long A=0, B=1;
    while(n>0 && m>0){
    
        A=A+(n%10*10+m%10)*B;
        B=B*100;
        n=n/10;
        m=m/10;
        
        
        
    }
  if(n>0)
      A=A+n*B;
      else
      A=A+m*B;
      
     return A;
        
    }
    
    public static void main(String[] args) {
        System.out.println(Combina(15247, 34755));
    }
    
}
