/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo8;

/**
 *
 * @author isacc
 */
public class PalavraThis {
    
    public String color;
    
    private String color2;
    private int height;
    private int length;
    
    public void setColor(String color){
        color = color;
    }
    
    public void setColor2(String color){
        this.color = color;
    }
    
    public void setData(int length, int theHeight){
        
        length = this.length;
        height = theHeight;
        this.color2 = "White";
        
    }
    
    
    
    public static void main(String[] args) {
        
           PalavraThis p = new PalavraThis();
           
           p.setColor("Red");
                
           System.out.println(p.color);
           
           p.setColor2("Red");
                
           System.out.println(p.color);
           
           p.setData(1, 2);
           
           System.out.println(p.length + " " + p.height + " " + p.color2);
           
           
    }
    
    
}
