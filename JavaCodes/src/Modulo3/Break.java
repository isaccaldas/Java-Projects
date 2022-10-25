/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo3;

/**
 *
 * @author isacc
 */
public class Break {
   
    public static void main(String[] args) {
        
        boolean t = true;
        
        first:{
        
            second:{
                
                third:{
                    
                    System.out.println("Before the break.");
                    if(t)break second; // encerra o segundo (second) bloco
                    System.out.println("This won't execute");
                    
                }//fim third
                
                System.out.println("This won't execute");
        
            }// fim second
        
            System.out.println("This is after second block");
            
        }// fim first
        
        
    }
    
    
    
}
