/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

import java.util.Scanner;

public class Exercicio3 {
   

    public static double calculo(double x){
    double calculo;
    calculo =  3 * Math.pow (x,3)+ 2*Math.pow (x,2)+x+1;
    return calculo;
    }
        
      

public static void main (String[] args){
    Scanner entrada = new Scanner (System.in);   
    
        float n;
        double calc;
                
        System.out.println("Digite um numero:");
        n = entrada.nextInt();
        System.out.println ("O resultado é:" +calculo(n));

  
        
        }
}
