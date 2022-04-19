package Exercicio3;

public class Main {

	public static void main(String[] args) {
		Funcionario cadastro = new Funcionario();
		cadastro.cargo = "Desenvolvedor";
		cadastro.setNome("Rubens");
		cadastro.setCpf("131.245.123-13");
		cadastro.setIdade(19);
		cadastro.GetHorasTrabalhadas();
		cadastro.Mostra();
		

	}

}
