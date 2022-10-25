/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo3;

/**
 *
 * @author isacc
 */
public class BreakLoop2 {
    
     public static void main(String[] args) {
     
         int i = 0;
         
         while(i<100){
            if(i == 10) break; //finaliza o loop se i for igual a 10
            System.out.println("i= " + i);
            i++;
         }
        
        
        System.out.println("Loop completo");
        
    }
    
}
