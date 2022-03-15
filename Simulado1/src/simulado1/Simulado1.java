/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulado1;

import java.util.Scanner;
public class Simulado1 {
   
    public static void main(String[] args) {
 
    Scanner entrada = new Scanner (System.in);
    int x,y, i;
        
         
        System.out.println("Digite o primeiro número: ");
        x = entrada.nextInt();
        
        System.out.println("Digite o segundo número: ");
        y = entrada.nextInt();
      
        
        for(i=x; i<=y; i++){
           if(i%2==0 && i%3==0){
               System.out.print(" "+i);
           }
    }
    }
}