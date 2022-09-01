/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo3;

/**
 *
 * @author isacc
 */
public class Casting2 {

    public static void main(String[] args) {
        
        float numero = 123.456f;
        Float numero2 = new Float(numero);
        int numeroInt = (int)numero; // casting
        
        //FAzendo um casting com perda de precisão
        System.out.println("NumeroInt " + numeroInt);
        
        //Mesmo resultado usando Float.intValue
        System.out.println(numero2.intValue());
    }

    
}
