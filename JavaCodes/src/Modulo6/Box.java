/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo6;

/**
 *
 * @author isacc
 * Essa classe define um novo tipo Box.
 * 
 * 
 */
public class Box {
    
    double width;   //variáveis de instância da classe Box
    double height;  //variáveis de instância da classe Box
    double depth;   //variáveis de instância da classe Box
         
}

class BoxDemo{

    public static void main(String[] args) {
            
        Box mybox = new Box();
        Box mybox2 = new Box();
        double volume;
        
        //Atibuindo valores para as variáveis de instância ao objeto Box criado.
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
    
         //Atibuindo valores para as variáveis de instância ao objeto Box2 criado.
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        
        //Totalizando o volume do objeto Box
        volume = mybox.width * mybox.height * mybox.depth;
        System.out.println("O Volume é " + volume);
        
        //Totalizando o volume do objeto Box2
        volume = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("O Volume é " + volume);
    }

}
