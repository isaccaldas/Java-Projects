/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo7;

/**
 *
 * @author isacc
 */
public class OuterInneClass {
    
    int outer_x = 100;
    
    void test(){
    
        Inner inner = new Inner();
        inner.display();
        
        //nested class podem ser inseridas dentro de blocos como métodos, estruturas de repetição e etc
        class Inner2{
            void display(){
            System.out.println("display: outer_x = " + outer_x);
        }
        }
    
    }
    
    //Exemplo de inner class
    class Inner{
        
        int y; //variável local a Inner Class
    
        //Método acessando atributo da class OuterInnerClass
        void display(){
            System.out.println("display: outer_x = " + outer_x);
        }
    
    } // fim Inner
    
    
    void showY(){
    
        //System.out.println(y); // Erro. y está local a inner class
    }
    
    
    
} // fim OuterInneClass



 // Outra InnerClass
    class InnerClassDemo{
        
        public static void main(String[] args) {
            
            OuterInneClass outer = new OuterInneClass();
            
            outer.test(); //acessando o método que busca informaçoes da inner class
            
            //Inner x = new Inner(); // Erro. nested class
            
        }
    
    }