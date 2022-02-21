import java.util.Scanner;

public class Exercicio1{
    
    public static void main (String[] args){
        
        int notaprova;
        int notatrabalho;
        int media;
        
        
         Scanner entrada = new Scanner (System.in);
        
        System.out.println ("Digite a nota da prova: ");
        notaprova = entrada.nextInt();
        
        System.out.println ("Digite a nota do trabalho");
        notatrabalho = entrada.nextInt();
        
        media=notatrabalho+notaprova;
        
        if(media >85 ){
            System.out.println("Conceito A. Parabéns, você foi aprovado!");
        }
        else if(media>70 && media<84 ){
            System.out.println("Conceito B. Parabéns, você foi aprovado!");
    }
       else if(media>60 && media<69 ){
            System.out.println("Conceito c.Parabéns, você foi aprovado!");
}
        
       else{
              System.out.println("Conceito D.Você foi reprovado!");

       }
    }
}