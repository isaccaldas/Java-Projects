/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo8;

/**
 *
 * @author isacc
 */
public class ExemploSuper {}

class A{

    int i;

}

class B extends A{

    int i; // sombreia(hides) i da classe A
    
    B(int a, int b){
    
    super.i = a; // pega a variável i da classe A
    i = b;       // pega a variável i da classe B
    
    }
    
    void show(){
    
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    
    }
    
}

class UseSuper{
    
    public static void main(String[] args) {
        
        B varB = new B(1,2);
        varB.show();
        
    }

}



