/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo7;

/**
 * Exemplo de usar um objeto como um parâmetro
 * @author isacc
 */
public class ObjectParameters {
    
    int a, b;
    
    ObjectParameters(int i, int j){
    
        a= i;
        a= j;
    
    }
    
    //return true if o is equal to the invoking object
    
    boolean equalTo(ObjectParameters o){
    
        if(o.a == a && o.b == b)
            return true;
        else
            return false;
    
    }
    
}

class PassOb{

    public static void main(String[] args) {
        
        ObjectParameters ob1 = new ObjectParameters(100,22);
        ObjectParameters ob2 = new ObjectParameters(100,22);
        ObjectParameters ob3 = new ObjectParameters(-1,-1);
        
        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
        
    }
}