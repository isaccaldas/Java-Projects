package Modulo8;

/**
 *
 * @author isacc
 */
public class Sobrescrita {
    
    public static void main(String... args) {
        B subOb = new B(1,2,3);
        subOb.show();
    }
}

class A{

    int i, j;
    
    A(int a, int b){
    
        i = a;
        j = b;
    
    }
    
    void show(){
    
           System.out.println("Class A");
           System.out.println("i and j: " + i + " " + j);
    
    }

}// Fim classe A

class B extends A{

    int k;
    
    B(int a, int b, int c){
        super(a,b);
        k = c;
    }

    //display k - sobrescreve show() na classe A
    void show(){
           System.out.println("Class B");
           System.out.println("k: " + k);
        
    }
}