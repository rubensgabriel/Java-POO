/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo0703;

/**
 *
 * @author ruben
 */
public class Exemplo0703 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String arg1, arg2;
        arg1 = args[0];
        arg2 = args[1];
        
        //Convertendo de string para inteiro
        int num = Integer.parseInt(arg1);
        int num2 = Integer.parseInt(arg2);
        
        System.out.println("A soma dos argumentos é " + (num + num2));
    }
    
}
