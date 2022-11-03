/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo7;

/**
 *
 * @author isacc
 */
public class ExemploVar {
    
    private int i;
        
    ExemploVar(int k) {
        i = k;
    }

    int geti() {
        return i;
    }

    void seti(int k) {

        if (k >= 0) {
            i = k;
        }

    }
    
    public static void main(String[] args) {
        
        var mc = new ExemploVar(10);
        
        System.out.println("Value of i in mc is " + mc.geti());
        
        mc.seti(20);
        
        System.out.println("Value of i in mc is now " + mc.geti());
        
    }
            
    
    
    
}
