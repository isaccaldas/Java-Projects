package Modulo8;

/**
 *
 * @author isacc
 */
public class Sobrescrita {
    
    public static void main(String[] args) {
         B3 subOb = new B3(1,2,3);
        subOb.show();
    }
    
   
}

class A3{

    int i, j;
    
    A3(int a, int b){
    
        i = a;
        j = b;
    
    }
    
    void show(){
    
           System.out.println("Class A3");
           System.out.println("i and j: " + i + " " + j);
    
    }

}// Fim classe A

class B3 extends A3{

    int k;
    
    B3(int a, int b, int c){
        super(a,b);
        k = c;
    }

    //display k - sobrescreve show() na classe A
    void show(){
           System.out.println("Class B3");
           System.out.println("k: " + k);
        
    }
}