/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo7;

/**
 *
 * @author isacc
 */
public class StaticDemo {
    
    static int a = 42;
    static int b = 99;
    
    static void callme(){
        System.out.println(" a = " + a);
    }
    
}

class StaticByName{
    
        public static void main(String[] args) {
            StaticDemo.callme();
            System.out.println("b = " + StaticDemo.b);
        }
    
    }