/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo8;

/**
 *
 * @author isacc
 */
public class MultilevelHierarchy {}

class Box {
    
    private double width;
    private double height;
    private double depth;

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

//    public BoxWeight(double w, double h, double d, double m) {
//        width = w;
//        height = h;
//        depth = d;
//        weight = m;
//    }

   public BoxWeight(double w, double h, double d, double m) {
        super(w,h,d);  //call superclass constructor
        weight = m;
    }

    public BoxWeight(BoxWeight ob) {
        
        super(ob);
        weight = ob.weight;
    }
    
    public BoxWeight() {
        
        super();
        weight = -1;
    }

     public BoxWeight(double len, double m) {
        
        super(len);
        weight = m;
    }
    

}// fim classe BoxWeight        
        
class Shipment extends BoxWeight{

    double cost;

    public Shipment(Shipment ob) {
        
        super(ob);
        cost = ob.cost;
        
    }
    
    public Shipment(double w, double h, double d, double m, double c) {
        
        super(w,h,d,m); // call superclass constructor
        cost = c;
        
    }
    
    //default constructor
    Shipment(){
        super();
        cost = -1;
    }
    
    Shipment(double len, double m, double c){
    
        super(len, m);
        cost = c;
    }
    

}//fim Shipment


class DemoShipment{
    
 public static void main(String[] args) {
        
        Shipment sh1 = new Shipment (10, 20, 15, 10, 3.41);
        Shipment sh2 = new Shipment (2, 3, 4, 0.76, 1.28);
     
        double vol;
        
        vol = sh1.volume();
        System.out.println("volume de sh1 " + vol);
        System.out.println("Peso de sh1 " + sh1.weight);
        System.out.println("custo " + sh1.cost);
        
        System.out.println();
        
        vol = sh2.volume();
        System.out.println("volume de sh2 " + vol);
        System.out.println("Peso de sh2 " + sh2.weight);
        System.out.println("custo " + sh2.cost);
        
        
    }

}