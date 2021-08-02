
public class Pessoa {
	private int idade;
	private int dia;
	private int mes;
	private int anoNascimento;
	private String nome;
	
	public Pessoa(int idade, int dia, int mes, int anoNascimento, String nome) {
		this.idade = idade;
		this.dia = dia;
		this.mes = mes;
		this.anoNascimento = anoNascimento;
		this.nome = nome;
	}
	//calcula idade, recebe data atual
	public int calculaIdade(int d, int m, int a) {
		if (a < anoNascimento || m > 12 || m <= 0 || d > 31  || d <= 0 || a <= 0) {
			System.out.println(d);
			System.out.println(m);
			System.out.println(a);
			System.out.println("erro");
			return this.idade = -1;
		}
		else if(a == anoNascimento) {
			if (m >= mes & d >= dia ) {
				System.out.println("menos de um ano");
				return this.idade = 0;
			}
			else {
				System.out.println("erro");
				return this.idade = -1;
			}
		}
		else if (m < mes) {
			a = a - 1;
		}
		else if (m == mes) {
			if (d < dia) {
				a = a - 1;
			}
		}
		a = a - anoNascimento;
		return this.idade = a;
	}
	//
	public int informaIdade() {
		return this.idade;
	}
	//
	public String informaNome() {
		return this.nome;
	}
	//recebe data de nascimento
	public void ajustaDataDeNascimento(int d, int m, int a){
		this.dia = d;
		this.mes = m;
		this.anoNascimento = a;
	}
}
