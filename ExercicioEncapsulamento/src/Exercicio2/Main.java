package Exercicio2;

public class Main {

	public static void main(String[] args) {
		Time t1 = new Time();
		t1.nome= "Cruzeiro";
				
		Time t2 = new Time();
		t2.nome = "América";
		
		t1.setPontos(5);
		t2.setPontos(2);
		t1.jogar(t1.nome);		
	}

}
