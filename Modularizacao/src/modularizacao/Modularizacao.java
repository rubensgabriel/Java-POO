/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modularizacao;

/**
 *
 * @author ruben
 */
public class Modularizacao {

    public static double media(double[] vetor){
        int i;
        double media, soma=0;
        for(i = 0;i < 4;i++){
            soma = soma + vetor[i];
    }
        media = soma/4;
        return media;
    }
    public static void main(String[] args) {
        int i;
        double resultado;
        double vetor[];
        vetor = new double[4];
        
        for(i = 0;i < 4;i++){
            vetor[i] = i;
        }
        resultado = media(vetor);
        System.out.println(resultado);
        System.out.println(media(vetor));
    }
    
}
