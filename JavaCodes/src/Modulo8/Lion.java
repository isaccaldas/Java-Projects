/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo8;

/**
 *
 * @author isacc
 */
public class Lion extends Animal{

    public void SetProperties(int age, String n){
        
        setAge(age); //Acessando o método por meio de herança
        name = n;    //Acessando o método por meio de herança
    }
    
    public void roar(){
    
        System.out.println(name + ", age = " +  getAge() + " Roar!!");
    
    }
    
    public static void main(String[] args) {
        var lion = new Lion();
        
        lion.SetProperties(3, "kion");
        lion.roar();
    }
    
    
}
