/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo8;

/**
 *
 * @author isacc
 */
public class ExemploHerançaPrivate {
    
    int i; // Acesso default
    private int j; //privado para a classe ExemploHerançaPrivate
    
    void setij(int x, int y){
    
        i = x;
        j = y;
    }
        
}

class Filha extends ExemploHerançaPrivate{
    
        int total;
        
        void sum(){
        
           // total = i+j; //Erro j não é acessível aqui pois é privado na classe pai.
        }
    
    }