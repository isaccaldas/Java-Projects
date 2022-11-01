/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo7;

/**
 *
 * @author isacc
 */
public class UsesStatic {
    
    static int a = 3;
    static int b;
    
    static void meth(int x){
        
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    
    }
    
    static{
    
        System.out.println("bloco inicializador de classe(static)");
        a = 2 ;
        b = a * 4;
    }
    
    public static void main(String[] args) {
        meth(42);
    }
    
    
}
