/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo7;

/**
 *
 * @author isacc
 */
public class ReturnObj {
   
    public static void main(String[] args) {
        
        Test6 ob1 = new Test6(2);
        Test6 ob2;
        
        ob2 = ob1.incrByTen();
        
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
        
        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase: " + ob2.a);
        
    } //fim main
    
    
}// fim ReturnObj

class Test6{
    
    int a;
    
    //Construtor
    Test6(int i){
    
        a = i;
    
    }
    
    //método que retorna um objeto do tipo Test
    Test6 incrByTen(){
        
        Test6 temp = new Test6(a + 10);
        return temp;
    }

}