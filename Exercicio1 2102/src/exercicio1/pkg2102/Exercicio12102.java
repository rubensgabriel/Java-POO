/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1.pkg2102;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class Exercicio12102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int nota1, nota2, media;
        
        System.out.println("Informe a nota do trabalho: ");
        nota1 = entrada.nextInt();
        
        System.out.println("Informe a nota da prova: ");
        nota2 = entrada.nextInt();
        
        media = nota1 + nota2;
        
        if(media>=85 && media<=100){
            System.out.println("Conceito A");
        }
        
        else if(media>=70 && media<85){
            System.out.println("Conceito B");
        }
        
        else if(media>=60 && media<70){
            System.out.println("Conceito C");
        }
        
        else{
            System.out.println("Conceito D");
        }
    }
    
}
