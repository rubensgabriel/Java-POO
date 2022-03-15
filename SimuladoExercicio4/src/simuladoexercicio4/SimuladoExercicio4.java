/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simuladoexercicio4;

/**
 *
 * @author rubens
 */
public class SimuladoExercicio4 {
    public static void main(String[] args) {
        int altura = 5;
        int largura = 5;
        for (int j = 0; j < largura; j++) System.out.print("*");
        System.out.print("\n");
        for (int i = 2; i < altura; i++) {
            System.out.print("*");
            for (int j = 2; j < largura; j++) System.out.print(" ");
            System.out.print("*\n");
        } 
        for (int j = 0; j < largura; j++) System.out.print("*");
    }
}
