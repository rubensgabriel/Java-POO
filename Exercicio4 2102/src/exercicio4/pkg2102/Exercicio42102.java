/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4.pkg2102;

/**
 *
 * @author ruben
 */
public class Exercicio42102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        int n = 5;
        
        double s = 0;
        
        for(i = 1;i <= n;i++){
            s = s + 1.0/i;
        }
        System.out.print("O resultado de s é: " + s);
    }
    
}
