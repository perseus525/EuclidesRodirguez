/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marclo
 */
public class Iter {
 
    public static int mcd(int a, int b){
    
    int resultado = 0;
    
    int coeciente=1;
    
    int resto=1;
    
    while (resto>0){
        
        coeciente = a/b;
        
        resto = a - b * coeciente;
    
        a = b;
        
        b = resto;
    }
    System.out.println("el mcd es "+ a );
    return a;
    }
}
