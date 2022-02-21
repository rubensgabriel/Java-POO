package exercicio2;

public class Exercicio2 {
  
    
    public static void main (String[] args){
        
        int vetor [] = new int [10];
        int i;
        
        for(i=0; i<10; i++){
            vetor [i] = i;
            
         if(i%2==0){
            vetor[i]=2;
         }
         
         else{
         vetor[i]=1;
         }
        }
        
for(i=0; i<10; i++){
    System.out.println (vetor[i]);
}
    }
}