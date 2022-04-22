/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio30703;

/**
 *
 * @author ruben
 */
public class Exercicio30703 {

    public static double soma(double[] vetor, int n){
        int i;
        double soma = 0.0;
        for(i = 0;i < n;i+=2){
            soma = vetor[i]-vetor[i+1];
        }
        return soma;
    }
    public static void main(String[] args) {
        int i;
        int j = 1;
        int n = 9;
        double vetor[];
        vetor = new double[n];
        
        for(i = 0;i < n;i++){
             vetor[i] = 1.0/(j);
             j+=2;
             //System.out.println(vetor[i]);
        }
        System.out.println(soma(vetor, n));
    }
    
}
