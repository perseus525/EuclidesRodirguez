/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marclo
 */
public class MCD{
 
    public static int mcdIter(int a, int b){
    
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
    
    
    public static int mcdRecursivo(int a, int b){
        int c = a%b;
       if(c==0) return b;
        else{
         return mcdRecursivo(b,c);
        }
            
    }
}
