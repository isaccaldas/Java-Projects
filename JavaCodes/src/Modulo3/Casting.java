/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo3;

/**
 *
 * @author isacc
 */
public class Casting {
    
    public static void main(String[] args) {
        
    short numero;
    int contador = 0;
    
    //verificando o tamanho máximo e mínimo do tipo short
    int valorMinimo = Short.MIN_VALUE;
    int valorMaximo = Short.MAX_VALUE;
    
    //o loop deve ocorre entre o range do valor máximo e mínimo de um tipo short
    for(int i = valorMinimo; i <= valorMaximo; i++){
        
        
        numero = (short)i; // fazendo um cast em i.
        
        if(i == valorMinimo){
            System.out.println("Valor Mínimo do short" + numero);
        }
        if(i == valorMaximo){
            System.out.println("Valor Maximo do short" + numero);
        }
        
        exibirShortInfo((contador+1), numero);
        contador++;
    }
    
  
}// fim main
    
    private static void exibirShortInfo(int i, short s){
        
        if(s == Short.MAX_VALUE){
        
            System.out.println(i);
        
        }
    
    }  
    
    
    
    
    
    
}
