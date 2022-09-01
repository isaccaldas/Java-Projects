/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo3;

/**
 *
 * @author isacc
 */
public class CompararStringBuilder {
    
    public static void main(String[] args) {
        
        //Criando dois StringBuilders
        StringBuilder sb = new StringBuilder("Minha casa");
        StringBuilder sb2 = new StringBuilder("Minha casa");
        
        //Comparando as referências usando o == (comparador)
        System.out.println("sb == sb2 = " + (sb == sb2));
        
        //Usando o .equals do pacote java.lang.Object
        System.out.println("sb.equals(sb2) = " + (sb.equals(sb2)));
        
        //Usando o método compareTo()
        System.out.println("sb.compareTo(sb2) = " + sb.compareTo(sb2));
        
        //Usando o equals() para comparar Strings a partir de um objeto StringBuilder
        System.out.println("sb.toString().equals(sb2.toString()) = " + sb.toString().equals(sb2.toString()));
        
        //Usando o == para comparar Strings a partir de um objeto StringBuilder
        System.out.println("sb.toString() == sb2.toString() = " + (sb.toString() == sb2.toString()));
        
        
    }
    
}
