/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio20703;


public class Exercicio20703 {

    public static int pares(int[] vetor, int n){
        int i;
        int pares = 0;
        for(i = n-1;i >= 0;i--){
            if(vetor[i]%2==0){
                pares++;
            }
        }
        return pares;
    }
    public static void main(String[] args) {
        int i;
        int n = 10;
        int vetor[];
        vetor = new int[n];
        for(i = n-1;i >= 0;i--){
            vetor[i] = i;
        }
        System.out.println(pares(vetor, n));
    }
    
}
