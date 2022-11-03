/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo8;

/**
 *
 * @author isacc
 */
public class Box {
    
    double width;
    double height;
    double depth;

    //construtor usando um objeto como paramentro
    public Box(Box obj) {
        this.width = obj.width;
        this.height = obj.height;
        this.depth = obj.depth;
    }
    
    
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
    
}// fim classe Box

        
class BoxWeight extends Box{

double weight;

    public BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }

}// fim classe BoxWeight        
        

class TestBox{
 public static void main(String[] args) {
        
        BoxWeight mybox = new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);     
        double vol;
                
        vol = mybox.volume();
        System.out.println("volume de box1 = " + vol);
        System.out.println("Peso de box1 = " + mybox.weight);
        
        System.out.println();
        vol = mybox2.volume();
        System.out.println("volume de box2 = " + vol);
        System.out.println("Peso de box2 = " + mybox2.weight);
        
    }

}