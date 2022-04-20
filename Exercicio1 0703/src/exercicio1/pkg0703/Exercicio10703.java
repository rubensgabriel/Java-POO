/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1.pkg0703;

/**
 *
 * @author ruben
 */
public class Exercicio10703 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String arg1, arg2;
        arg1 = args[0];
        arg2 = args[1];
        
        int num1 = Integer.parseInt(arg1);
        int num2 = Integer.parseInt(arg2);
        
        System.out.print("ADIÇÃO: " + (num1 + num2));
        System.out.print("SUBTRAÇÃO: " + (num1 - num2));
        System.out.print("MULTIPLICAÇÃO: " + (num1 * num2));
        System.out.print("DIVISÃO: " + (num1 / num2));
    }
    
}
