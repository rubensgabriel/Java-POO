package Exercicio3;

public class Funcionario {
	private String nome;
	public String cargo;
	private String cpf;
	private int idade;
	private int[] HorasTrabalhadas = { 0, 0, 0, 0 };

	public HoraExtra HExtra = new HoraExtra("", 0);

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int GetHorasTrabalhadasTotal() {
		int val = 0, len = HorasTrabalhadas.length;
		for (int i = 0; i < len; i++) {
			val += HorasTrabalhadas[i];
		}
		return val;
	}

	public String GetHorasTrabalhadas() {
		int len = HorasTrabalhadas.length;
		for (int i = 0; i < len; i++) {
			System.out.println((i + 1) + "º Domingo: " + HorasTrabalhadas[i] + " hrs");
		}
		return "";
	}

	public class HoraExtra {
		private int Valor;

		public HoraExtra(String t, int v) {
			this.Valor = v;
		}

		public void SetTipo(String t) {
		}

		public String GetTipo() {
			return "nenhum";
		}

		public void SetValor(int v) {
			this.Valor = v;
		}

		public int GetValor() {
			return this.Valor;
		}
	}

	void Mostra() {
		System.out.println("Nome     : " + nome);
		System.out.println("Profissão: " + cargo);
		System.out.println("CPF      : " + cpf);
		System.out.println("Idade    : " + idade);
		System.out.println("Horas Trabalhadas: " + GetHorasTrabalhadasTotal() + " hrs" );
		System.out.println("Tipo de hora extra: " + this.HExtra.GetTipo());
		System.out.println("Valor de hora extra: " + this.HExtra.GetValor());
	}

}
