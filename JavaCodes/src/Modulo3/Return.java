/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo3;

/**
 *
 * @author isacc
 */
public class Return {
    
    public static void main(String[] args) {
        
        boolean t = true;
        
        System.out.println("Before the return");
        
        if (t) {
            
            return; // retorna ao chamador
        }
        
        System.out.println("This won't execute");
        
    }
    
    
}
