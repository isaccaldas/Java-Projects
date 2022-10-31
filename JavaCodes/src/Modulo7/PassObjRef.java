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
        
        Test ob = new Test(15, 20);
        
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        
        ob.meth(ob);
        
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
        
        
    }// fim main
    
    
}//fim class PassObjRef

class Test{
    
    int a, b;
    
    Test(int i, int j){
        
        a = i;
        b = j;
    
    }
    
    
    //Passando um objeto
    void meth(Test o){
        
         o.a *= 2;
         o.b /= 2;
        
    }
    
}