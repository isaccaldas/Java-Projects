/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo3;

/**
 *
 * @author isacc
 */
public class BreakLoop3 {
    
     public static void main(String[] args) {
     
        for(int i = 0; i < 3; i++){
        
            System.out.print("Pass " + i + ": ");
        
            for(int j = 0; j < 100; j++){
            
                if(j == 10) break; //finaliza o loop se j for igual a 10
                System.out.print(j + " ");
        }
        
        System.out.println();
        
    }
        System.out.println("Loop completo");
        
}

}
