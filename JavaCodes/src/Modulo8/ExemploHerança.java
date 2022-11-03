/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo8;

/**
 *
 * @author isacc
 */
public class ExemploHerança {
    
    int i,j;
    
    void showij(){
        System.out.println("i and j: " + i + " " + j);
    
    }
    
}

class Filha extends ExemploHerança{

    int k;

    void showk(){
    
        System.out.println("k: " + k);
    }
    
    void sum() {
        System.out.println("i+j+k: " + (i+j+k));
    }
    
}

class TesteHerança{
    
    public static void main(String[] args) {
        
        ExemploHerança varA = new ExemploHerança();
        Filha varB = new Filha();
       
        //Exemplo de uso da superclasse
        varA.i = 10;
        varA.j = 20;
        System.out.println("Conteudo de varA: ");
        varA.showij();
        System.out.println();
        
        //Exemplo de uso da subclasse com acesso ao membros públicos da superclasse
        varB.i = 7;
        varB.j = 8;
        varB.k = 9;
        
        System.out.println("Conteudo de varB: ");
        varB.showij();
        varB.showk();
        System.out.println();
        System.out.println("Somatório de i,j,k em varB: ");
        varB.sum();
        
    }

   
    
    
    

}