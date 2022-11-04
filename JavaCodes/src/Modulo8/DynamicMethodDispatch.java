package Modulo8;

/**
 *
 * @author isacc
 */
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        
        Dispatch1 a = new Dispatch1();
        Dispatch2 b = new Dispatch2();
        Dispatch3 c = new Dispatch3();
        
        Dispatch1 r; // obtain a reference of type Dispatch1
        
        r = a; // r refers to an Dispatch1 object.
        r.callme(); // chama o callme() da classe Dispatch1
        
        r = b; // r refers to an Dispatch2 object.
        r.callme(); // chama o callme() da classe Dispatch2
        
        r = c; // r refers to an Dispatch3 object.
        r.callme(); // chama o callme() da classe Dispatch3
        
    }
}

class Dispatch1{

    void callme(){
        System.out.println("Dentro da classe Dispatch1");
    }
    
}// fim Dispatch1

class Dispatch2 extends Dispatch1{

    //Sobrescreve callme() da classe Dispatch1
    void callme(){
        System.out.println("Dentro da classe Dispatch2");
    }
    
}// fim Dispatch2

class Dispatch3 extends Dispatch1{

    //Sobrescreve callme() da classe Dispatch1
    void callme(){
        System.out.println("Dentro da classe Dispatch3");
    }
    
}// fim Dispatch3