/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo4;

/**
 *
 * @author isacc
 */
public class OperadorUnario {
    
    public static void main(String[] args) {
        
        //Exemplo 1
        System.out.println("Exemplo 1");
        
        int a = 0;
        System.out.println(a);//a=0
        ++a;
        System.out.println(a);//a=1
        
        System.out.println(a);//a=1
        
        a--;
        System.out.println(a);//a=0
        
        //Exemplo 2
        System.out.println("Exemplo 2");
        a=1;
        System.out.println(++a); //2
        System.out.println(a++); //2
        System.out.println(a);   //3
        
        //Exemplo 3
        System.out.println("Exemplo 3");
        //Pos incremento em uma declaração de variável
        a=1;
        int a2 = a++;
        System.out.println(a); //a=2
        System.out.println(a2); //a=1
                
        //Pos incremento em uma expressão
        a=1;
        if(++a != 1){
            System.out.println(a);//a=2
        }
    }
    
    
}
