/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz1;

/**
 *
 * @author ruben
 */
public class Matriz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j;
        
        int matriz[][] = new int[5][5];
        
        //RETANGULO
        for(i = 0;i < 5;i++){
            for(j = 0;j < 5;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        //TRIANGULO PRA CIMA
        for(i = 0;i < 5;i++){
            for(j = 0;j < i+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        //TRIANGULO PRA BAIXO
        for(i = 5;i > 0;i--){
            for(j = 0;j < i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
