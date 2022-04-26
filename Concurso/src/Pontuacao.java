
import java.util.Scanner;

final class Candidato {
    private String nome;
    private String sexo;
    private int pontos;

    
    public Candidato(String nome, String sexo, int pontos) {
        setNome(nome);
        setSexo(sexo);
        setPontos(pontos);
    }

    public Candidato(){

    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getSexo() {
        return this.sexo;
    }

    public int getPontos() {
        return this.pontos;
    }
    
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

public class Pontuacao{

    public static Candidato setCandidatos (String nome, String sexo, int pontos){
        Candidato candidato = new Candidato(nome, sexo, pontos);
        return candidato;
    }

    public static double media(Candidato candidato[]){
        int var = 0;
        double media = 0;
        int total = 0;
        for(int i=0; i<4; i++){
            if(candidato[i].getSexo().equalsIgnoreCase("F")){
                    total = candidato[i].getPontos();
                    var++;
            }
        }
         media = (total/var);
            return media;
    }    

    public static void imprimeCandidatos(Candidato candidato[]){
        for(int i=0; i<4; i++){
            if(candidato[i].getPontos() > 70){
                 System.out.println("Candidato: " + candidato[i].getNome() + " - " + candidato[i].getSexo() + " - " +candidato[i].getPontos());
            }
        }
    }   
    
    public static void main(String[] args){
         Candidato[] candidato = new Candidato[200];
        String nome = new String("aa");
        String sexo = new String("bb");
        int pontos = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);            
             
      while(i < 4){
           System.out.println("Digite o nome do candidato: ");
            nome = sc.next();
            System.out.println("Digite o sexo do candidato: ");
            sexo = sc.next();
            System.out.println("Digite a pontuacao do candidato: ");
            pontos = sc.nextInt();
            candidato[i] = setCandidatos(nome, sexo, pontos);
            i++;
        } 
      
        sc.close();
        double m = media(candidato);
        imprimeCandidatos(candidato);
        
        System.out.println("A media de votos do sexo feminino é: " + m);
    

    }


} 