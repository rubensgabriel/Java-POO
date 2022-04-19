package Exercicio2;

public class Time {

	public String nome;
	private int pontos = 0;	
	
	
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {			
		this.pontos = pontos;
	}	
	public void jogar(String t1){
		System.out.println(this.nome + " ganhou a partida!");					
	}
	
}
