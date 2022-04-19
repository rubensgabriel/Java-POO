/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3.pkg2102;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class Exercicio32102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, num;
        Scanner entrada = new Scanner (System.in);
        
        int vetor[] = new int[20];
        
        System.out.print("Informe o valor que será multiplicado: ");
        num = entrada.nextInt();
        
        for(i = 0; i < 20; i++){
            vetor[i] = i+1;
        }
        for(i = 0; i < 20; i++)
           vetor[i] = vetor[i]*num;
        
        for(i = 0; i < 20; i++){
            System.out.println(vetor[i]);
        }
    }
    
}
