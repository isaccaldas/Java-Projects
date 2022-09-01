/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo3;

/**
 *
 * @author isacc
 */
public class StringBuilderCriacao {
    
    public static void main(String[] args) {
        
        //Criando um StringBuilder vazio
        //Um StringBuilder vazio possui a capacidade inicial de 16
        StringBuilder sb = new StringBuilder();
        
        // Adicionando uma String de 5 caracteres no inicio do espaço.
        sb.append("Amigo");
        
        //Exibindo o tamanho do StringBuilder
        System.out.println("Tamanho do sb = " + sb.length());
        
        //Exibindo a capacidade do StringBuilder
        System.out.println("Capacidade do sb = " + sb.capacity());
        
        //Criando um outro StringBuilder iniciando com uma string
        StringBuilder sb2 = new StringBuilder("Mundo");
        
        //Exibindo o tamanho do StringBuilder2
        System.out.println("Tamanho do sb2 = " + sb2.length());
        
        //Exibindo a capacidade do StringBuilder2
        //Nesse exemplo, a capacidade é a soma de 16 (inicial) + a qtde de caracteres passado por parâmetro(5).
        System.out.println("Capacidade do sb2 = " + sb2.capacity());
        
        //Criando um terceiro StringBuilder com uma String de 26 caracteres
        StringBuilder sb3 = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        
        //Exibindo o tamanho do StringBuilder3
        System.out.println("Tamanho do sb3 = " + sb3.length());
        
         //Exibindo a capacidade do StringBuilder3
        //Nesse exemplo, a capacidade é a soma de 16 (inicial) + a qtde de caracteres passado por parâmetro (26).
        System.out.println("Capacidade do sb3 = " + sb3.capacity());
        
        //Criando o sb4 com o valor da capacidade inicial. Nesse exemplo 26
        StringBuilder sb4 = new StringBuilder(26);
        
        //Adicionando 26 caracteres no inicio
        sb4.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        
        //Exibindo o tamanho do StringBuilder sb4
        System.out.println("Tamanho do sb4 = " + sb4.length());
        
        //Exibindo a capacidade do StringBuilder2
        //Nesse exemplo, a capacidade é a soma de 16 (inicial) + a qtde de caracteres passado por parâmetro(5).
        System.out.println("Capacidade do sb4 = " + sb4.capacity());
        
        
    }
    
    
}
