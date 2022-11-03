/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo7;

/**
 *
 * @author isacc
 */
public class VarArgs {
    
    static void vaTest(int... v){
    
        System.out.println("Number of args: " + v.length + " Contents: ");
    
        for (int i : v) {
            
            System.out.print(i + " ");
            
            System.out.println();
        }
    }//fim vaTest
    
    static void vaTest(boolean... v){
    
        System.out.println("Number of args: " + v.length + " Contents: ");
    
        for (boolean i : v) {
            
            System.out.print(i + " ");
            
            System.out.println();
        }
    }//fim vaTest
    
    static void vaTest(String msg, int... v){
    
        System.out.println("Number of args: " + v.length + " Contents: ");
    
        for (int x : v) {
            
            System.out.print(x + " ");
            
            System.out.println();
        }
    }//fim vaTest
    
     
     
    
    
    //o varArg deve ser o último parâmetro
    int doIt(int a, int b, double c, int... vals){
    return 0;
    }
    
    
    
    public static void main(String[] args) {
        
        // Notice how vaTest() can be called with a varArgs.
        
        vaTest(10);      // 1 argumento
        vaTest(1,2,3);   // 3 argumentos
        //vaTest();        // 0 argumentos
        
    }
}
