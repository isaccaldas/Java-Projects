/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo7;

/**
 *
 * @author isacc
 */
public class Stack {
    
    private int stck[] = new int[10];
    private int tos;
    
    Stack(){
    
        tos = -1;
    
    }
    
    //Push an item onto the stack
    void push(int item){
        
        if(tos == 9)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }
    
    //pop an item from the stack
    int pop(){
    
        if(tos < 0){
        
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return stck[tos--];
    
    }
    
}
