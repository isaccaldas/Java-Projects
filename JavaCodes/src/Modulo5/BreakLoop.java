/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo5;

/**
 *
 * @author isacc
 */
public class BreakLoop {
 
    public static void main(String[] args) {
     
        for(int i = 0; i < 100; i++){
        
            if(i == 10) break; //finaliza o loop se i for igual a 10
            System.out.println("i= " + i);
        }
        
        System.out.println("Loop completo");
        
    }
    
    
}
