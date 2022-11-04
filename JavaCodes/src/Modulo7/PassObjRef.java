/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo7;

/**
 *
 * @author isacc
 */
public class PassObjRef {
    
    public static void main(String[] args) {
        
        Test5 ob = new Test5(15, 20);
        
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        
        ob.meth5(ob);
        
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
        
        
    }// fim main
    
    
}//fim class PassObjRef

class Test5{
    
    int a, b;
    
    Test5(int i, int j){
        
        a = i;
        b = j;
    
    }
    
    
    //Passando um objeto
    void meth5(Test5 o){
        
         o.a *= 2;
         o.b /= 2;
        
    }
    
}