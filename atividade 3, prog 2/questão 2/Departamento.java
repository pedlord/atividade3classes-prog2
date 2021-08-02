import java.util.ArrayList;
import java.util.List;

public class Departamento {
	private String nome;
	private List<Pessoa> pessoas;
	
	public Departamento(String nome, List<Pessoa> arra) {
		this.nome = nome;
		this.pessoas = arra;
	}
	public String depNome() {
		return this.nome;
	}
	public void getPessoas() {
		List<String> te = new ArrayList<String>();
		System.out.println("Total de pessoas desse dep: " + pessoas.size());
		System.out.println("Pessoas desse departamento:");
		for (int i = 0; i < pessoas.size(); i++) { 
			Pessoa teste = pessoas.get(i);
			te.add(teste.informaNome());
			System.out.printf("-");
			System.out.println(te.get(i));
		}
	}
	public void adicionarDep(List<Pessoa> algo, Pessoa pess) {
		if (pessoas.size() < 2) {
			algo.add(pess);
		}
		else {
			System.out.println("não pode adicionar mais pessoas");
		}
	}
	public List<Pessoa> getPessoa()
    {
        return pessoas;
    }
}
