/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo7;

/**
 *
 * @author isacc
 */
public class OverloadDemo {
    
    void test(){
        
        System.out.println("Sem parametros");
    }
    
    //sobrecarga(overload) do método adicionando um parametro inteiro
    void test(int a){
        
        System.out.println("a: " + a );
    }
    
    //sobrecarga(overload) do método adicionando dois parametros inteiros
    void test(int a, int b){
        
        System.out.println("a and b: " + a + " " + b);
    }
    
    //sobrecarga(overload) do método adicionando um parametro double
    double test(double a){
        
        System.out.println("a: " + a );
        return a*a;
    }

}// fim da classe OverloadDemo

class Overload{
    
    public static void main(String[] args) {
        
        OverloadDemo db = new OverloadDemo();
        
        double result;
        
        //Fazendo a chamada a todas as versões de test
        
        db.test();
        db.test(10);
        db.test(10,20);
        result = db.test(123.25);
        System.out.println("Resultado " + result);
        
    }


}