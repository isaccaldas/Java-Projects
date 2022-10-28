/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo7;

/**
 *
 * @author isacc
 */
public class OverloadDemo2 {
    
    
     void test(){
        
        System.out.println("Sem parametros");
    }
      
    //sobrecarga(overload) do método adicionando dois parametros inteiros
    void test(int a, int b){
        
        System.out.println("a and b: " + a + " " + b);
    }
    
    //sobrecarga(overload) do método adicionando um parametro double
    void test(double a){
        
        System.out.println("a: " + a );
        System.out.println("(double) a " + a);
    }

}// fim da classe OverloadDemo

class Overload{
    
    public static void main(String[] args) {
        
        OverloadDemo2 db = new OverloadDemo2();
        int i = 88;
        //double result;
        
        //Fazendo a chamada a todas as versões de test
        
        db.test();
        db.test(10,20);
        db.test(i);
        db.test(123.25);
        
    }

    
}
