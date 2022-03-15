package exercicio1;

import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
 
    Scanner entrada = new Scanner (System.in);
    int x, y, i;
         
        System.out.print("Digite o 1º número: ");
        x = entrada.nextInt();
        
        System.out.print("Digite o 2º número: ");
        y = entrada.nextInt();
      
        for(i=x; i<=y; i++){
           if(i%2==0 && i%3==0){
               System.out.print(" "+i);
           }
    }
    }
}
