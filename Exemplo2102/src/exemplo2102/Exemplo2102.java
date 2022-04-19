/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo2102;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class Exemplo2102 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Informe um número inteiro: ");
        num1 = entrada.nextInt();
        
        System.out.println("Informe outro número inteiro ");
        num2 = entrada.nextInt();
        
        if (num1 > num2){
            System.out.println("O maior número é " + num1);
        }
        else if (num2 > num1){
            System.out.println("O maior número é " + num2);
        }
        else{
            System.out.println("Os números são iguais!");
        }
    }
    
}
