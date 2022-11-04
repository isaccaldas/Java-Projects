package Modulo8;

/**
 *
 * @author isacc
 */
public class Sobrescrita2 {
    
  
    public static void main(String... args) {
        B2 subOb = new B2(1,2,3);
        subOb.show();
        subOb.show("This is K:");
    }
}

class A2{

    int i, j;
    
    A2(int a, int b){
    
        i = a;
        j = b;
    
    }
    
    void show(){
    
           System.out.println("Class A2");
           System.out.println("i and j: " + i + " " + j);
    
    }

}// Fim classe A

class B2 extends A2{

    int k;
    
    B2(int a, int b, int c){
        super(a,b);
        k = c;
    }

    //display k - sobrescreve show() na classe A
//    void show(){
//           System.out.println("Class B");
//           System.out.println("k: " + k);
//        
//    }
    
    //Sobrescrita
    void show(){
        System.out.println("Class B2");
        super.show();
        System.out.println("k: " + k);
     
    }
    
    //Sobrecarga
    void show(String msg) {
     System.out.println(msg + k);
    }
    
    
}
