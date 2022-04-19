/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.pkg2.pkg2102;

/**
 *
 * @author ruben
 */
public class Exercicio22102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        
        int vetor[] = new int[10];
        
        for(i = 0; i < 10; i+=2){
            vetor[i] = 2;
        }
        for(i = 1; i < 10; i+=2){
            vetor[i] = 1;
        }
        
        for(i = 0; i < 10; i++){
            System.out.println(vetor[i]);
        }
    }
    
}
