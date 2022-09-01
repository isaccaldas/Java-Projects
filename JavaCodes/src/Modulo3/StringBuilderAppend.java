/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo3;

/**
 *
 * @author isacc
 */
public class StringBuilderAppend {
    
    public static void main(String[] args) {
          /*
            These are the many flavors of append:
 
            StringBuilder append(boolean b)
            StringBuilder append(char c)
            StringBuilder append(char[] str)
            StringBuilder append(char[] str, int offset, int len)
            StringBuilder append(double d)
            StringBuilder append(float f)
            StringBuilder append(int i)
            StringBuilder append(long lng)
            StringBuilder append(CharSequence s)
            StringBuilder append(CharSequence s, int start, int end)
            StringBuilder append(Object obj)
            StringBuilder append(String str)
            StringBuilder append(StringBuffer sb)
            StringBuilder appendCodePoint(int codePoint)
         */
        
          StringBuilder sb = new StringBuilder(100);
          
          sb.append("Pátria amada ")
                  .append(new char[]{'B','r','a','s','i','l'})
                  .append(',')
                  .append((Object) " My ")
                  .append(97)
                  .append(25.35f)
                  .append(251231323L)
                  .append("");
          System.out.println(sb);
          System.out.println("length = " + sb.length());
          System.out.println("capacity= " + sb.capacity());
          
          
    }
    
    
}
