import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private static List<Pessoa> pessoas = new ArrayList<Pessoa>();
	static void armazenaPessoa(Pessoa pessoa) {
		if (pessoas.size() < 10) {
			pessoas.add(pessoa);
		}
		else {
			System.out.println("Agenda cheia, remova uma pessoa");
		}
	}
	static void removePessoa(String nome) {
		List<String> te = new ArrayList<String>();
		for (int i = 0; i < pessoas.size(); i++) { 
			Pessoa teste = pessoas.get(i);
			te.add(teste.informaNome());
			if (te.get(i) == nome) {
				pessoas.remove(i);
			}
		}
	}
	static int buscaPessoa(String nome) {
		List<String> te = new ArrayList<String>();
		for (int i = 0; i < pessoas.size(); i++) { 
			Pessoa teste = pessoas.get(i);
			te.add(teste.informaNome());
			if (te.get(i) == nome) {
				return i;
			}
		}
		System.out.println("não encontrado");
		return -1;
	}
	static void imprimeAgenda() {
		List<String> te = new ArrayList<String>();
		List<Integer> t = new ArrayList<Integer>();
		System.out.println("Pessoas na Agenda:");
		for (int i = 0; i < pessoas.size(); i++) { 
			Pessoa teste = pessoas.get(i);
			te.add(teste.informaNome());
			t.add(teste.informaIdade());
			System.out.printf("Nome: %s, idade: %d%n",te.get(i),t.get(i));
		}
	}
	static void imprimePessoa(int index) {
		List<String> te = new ArrayList<String>();
		int a = 0;
		for (int i = 0; i < pessoas.size(); i++) { 
			Pessoa teste = pessoas.get(i);
			te.add(teste.informaNome());
			if (i == index) {
				System.out.println(te.get(i));
				a = 1;
			}
		}
		if (a == 0) {
			System.out.println("não encontrado");
		}
	}
	public static void main(String args[]) throws Exception
	{
		Pessoa p = new Pessoa(21, 20,10,1999, "Pedro");
		Pessoa alb = new Pessoa(141, 14,13,1879, "Albert Eistein");
		Pessoa isa = new Pessoa(378, 4,1,1643, "Isaac Newton");
		System.out.println("armazenando pessoas");
		armazenaPessoa(p);
		armazenaPessoa(alb);
		armazenaPessoa(isa);
		imprimeAgenda();
		System.out.println("imprimindo a pessoa:");
		imprimePessoa(buscaPessoa("Pedro"));
		System.out.println("buscando posição da pessoa: " + buscaPessoa("Pedro"));
		System.out.println("removendo pessoa");
		removePessoa("Pedro");
		imprimeAgenda();
	}
}
