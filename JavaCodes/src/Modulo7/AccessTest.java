/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo7;

/**
 *
 * @author isacc
 */
public class AccessTest {
    
    public static void main(String[] args) {
    
        Test2 ob = new Test2();
    
        //These are Ok, a and b may be accessed directly
        ob.a = 10;
        ob.b = 20;
        
        //ob.c = 100; //Erro. C não pode ser acessado por possui um encapsulamento private na classe Test.

        ob.setc(100); //'c' pode ser acessado por meio de métodos.
        
        System.out.println("a, b, c: " + ob.a + "," + ob.b + "," + ob.getc());
                
    }
    
    
}

class Test2 {

int a; //acesso default 
public int b; //acesso publico
private int c; // acesso privado

void setc(int i){ // seta o valor de 'c'
    c = i;
}

int getc(){ // recupera o valor de 'c' 
    return c;
}


}
