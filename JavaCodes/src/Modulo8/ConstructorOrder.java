/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo8;

/**
 *
 * @author isacc
 */
public class ConstructorOrder {
 
    public static void main(String[] args) {
        C c = new C();
        System.out.println("");
        D d = new D();
    }
}

//Superclass
class A{

    A(){
    
        System.out.println("Dentro do construtor da Classe A");
  
    }

}

//subclasse B herdando de A
class B extends A{

    B(){
    
        System.out.println("Dentro do construtor da Classe B");
  
    }

}

//subclasse C herdando de B
class C extends B{

    C(){
    
        System.out.println("Dentro do construtor da Classe C");
  
    }

}

class D extends A{

    D(){
    
        System.out.println("Dentro do construtor da Classe D");
  
    }

}