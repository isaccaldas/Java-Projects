/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo7;

/**
 * Exemplo de sobrecarga de construtores
 * @author isacc
 */
public class Box {
    
    double width;
    double height;
    double depth;

    //construtor usando todas as dimensoes como paramentros 
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    //construtor sem paramentros 
    public Box() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }
    
    //construtor informando um paramentro 
    public Box(double len) {
        
        width = height = depth = len; 
    }
       
    double volume(){
    
        return width * height * depth;
    
    }
    
    public static void main(String[] args) {
        
        Box mybox = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);
        
        double vol;
        
        
        vol = mybox.volume();
        System.out.println("volume de box1 = " + vol);
        
        vol = mybox2.volume();
        System.out.println("volume de box2 = " + vol);
        
        vol = mybox3.volume();
        System.out.println("volume de box3 = " + vol);
    }
    
    
}
