/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo3;

/**
 *
 * @author isacc
 */
public class StringBuilderManipulacao {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Pátria, amada");
        System.out.println("Valor original do sb = " +sb);
        
        //Descobrindo a posição da vírgula
        System.out.println("Posiçao da vírgula = " + sb.indexOf(","));
        
        //Removendo a vírgula da String. O index of será usado para pegar a posição
        System.out.println("Valor ajustado do sb = " + sb.deleteCharAt(sb.indexOf(",")));
        
        System.out.println("Valor atual do sb = " +sb);
        
        //Remover todos os caracteres a partir
        //?? System.out.println("sb.delete(11,sb.length()) = " +
                //sb.delete(11, sb.length()));
        
        System.out.println("sb invertido = " +sb.reverse());
        System.out.println("Valor atual do sb = " +sb);
        System.out.println("sb invertido novamente = " +sb.reverse());
        
        StringBuilder sb2 = sb.reverse();
        System.out.println("sb2 = " +sb2);
        System.out.println("Valor atual do sb = " +sb);
        sb.reverse();
        System.out.println("Valor atual do sb2 = " +sb2);
        System.out.println("Valor atual do sb = " +sb);
        System.out.println("sb == sb "+ (sb == sb2));
        
        sb2.append(" Brasil");
        System.out.println("Valor atual do sb2 = " +sb2);
        System.out.println("Valor atual do sb = " +sb);
    }
    
    
}
