/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo5;

/**
 *
 * @author isacc
 */
public class BreakError {
    
    
    public static void main(String[] args) {
        
        one: for (int i = 0; i < 3; i++) {
            
            System.out.print("Pass " + i + ": ");
            
        }// fim ont
        
        for (int i = 0; i < 100; i++) {
            
            if (i == 10) {
                
                //break one; // Erro. Esse é um outro for
                
            }
            
            System.out.print(i + " ");
        }
        
        
    } //fim main
    
}
