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
    
    //Construtor
    public Box(){
    
        System.out.println("Inicializando os campos nos construtor");
        width = 10;
        height = 10;
        depth = 10;
        
    }
    
    //Construtor com parametros
    public Box(double width, double height, double depth){
    
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    
    
    //exibe o volume da caixa
    void displayVolume(){
        System.out.print("O Volume é ");
        System.out.println(width * height * depth); 
    }
    
    //Totaliza e retorna o volume
    double Volume(){
         
        return width * height * depth; 
    }
    
    //Seta a dimensão da caixa
    void setDim(double width, double height, double depth){
    
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
         
}

class BoxDemo{

    public static void main(String[] args) {
            
        Box mybox = new Box();
        Box mybox2 = new Box();
        Box mybox3; //declarando uma referëncia ao objeto Box
        mybox3 = new Box();// instanciando um objeto.
        
        Box b1 = new Box();
        Box b2 = b1; // b2 aponta para o mesmo objeto de b1
        
        
        double volume;
        
        //Atibuindo valores para as variáveis de instância ao objeto Box criado.
//        mybox.width = 10;
//        mybox.height = 20;
//        mybox.depth = 15;
          mybox.setDim(10, 20, 15);
    
         //Atibuindo valores para as variáveis de instância ao objeto Box2 criado.
//        mybox2.width = 3;
//        mybox2.height = 6;
//        mybox2.depth = 9;
          mybox2.setDim(3, 6, 9);        

        //Totalizando o volume do objeto Box
        volume = mybox.width * mybox.height * mybox.depth;
        System.out.println("O Volume é " + volume);
        
        //Totalizando o volume do objeto Box2
        volume = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("O Volume é " + volume);
        
        System.out.println("");
        
        //Totalizando o volume do objeto Box por meio de um método e exibindo a saída
        mybox.displayVolume();
        mybox2.displayVolume();
        
        System.out.println("");
        
        //Apresentando a totalização do volume
        System.out.println("O Volume é " + mybox.Volume());
        System.out.println("O Volume é " + mybox2.Volume());
        
        //exibindo o volume com o valores carregados do construtor
        System.out.println("O Volume é " + mybox3.Volume());
        
        //Usando um construtos com parametros
        Box mybox4 = new Box(10,20,15);
        Box mybox5 = new Box(3,6,9);
        
        System.out.println("");
        
        //exibindo o volume com o valores carregados do construtor
        System.out.println("O Volume é " + mybox4.Volume());
        //exibindo o volume com o valores carregados do construtor
        System.out.println("O Volume é " + mybox5.Volume());
        
        
        
    }   
   
}
