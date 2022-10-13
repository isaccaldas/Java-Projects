/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo8;

/**
 *
 * @author isacc
 */
public class BigCat {
    
    public double size;
    
}


class Jaguar extends BigCat{

public Jaguar(){
    
    size = 10.2;    

}

    public static void main(String[] args) {
        
        Jaguar j = new Jaguar();
        
        System.out.println(j.size);
        
    }

}