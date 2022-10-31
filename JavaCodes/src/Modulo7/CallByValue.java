/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo7;

/**
 *
 * @author isacc
 */
public class CallByValue {
    
    public static void main(String[] args) {
        
        Test ob =  new Test();
        
        int a = 15, b = 20;
        
        System.out.println("a and b before call: " + a + " " + b);
        
        ob.meth(a, b);
        
        System.out.println("a and b after call: " + a + " " + b);
     
    }
    
    
}

class Test{
    
    //Primitivos são passados por valores
    void meth(int i, int j){
        
        i *= 2;
        j /= 2;
        
    }
    
}