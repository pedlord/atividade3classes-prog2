import java.util.List;
import java.util.ArrayList;

public class Universidade{
	private String nome;
	private List<Departamento> departamento;
	
	public Universidade (String nome, List<Departamento> arra) {
		this.nome = nome;
		this.departamento = arra;
	}
	public String uniNome() {
		return this.nome;
	}
	public List<Departamento> getDepartamento()
    {
        return departamento;
    }
	public void getDeps() {
		List<String> te = new ArrayList<String>();
		System.out.println("Total de Departamentos: " + departamento.size());
		int conta = 0;
		for (int i = 0; i < departamento.size(); i++) { 
			Departamento teste = departamento.get(i);
			te.add(teste.depNome());
			conta++;
			System.out.printf("%dº Departamento:%n-", conta);
			System.out.println(te.get(i));
			teste.getPessoas();
		}
	}
	public void adicionarDep(List<Departamento> algo, Departamento departam) {
		if (departamento.size() < 10) {
			algo.add(departam);
		}
		else {
			System.out.println("não pode adicionar mais departamentos");
		}
	}
	public static void main(String args[]) throws Exception
	{
		Pessoa p = new Pessoa(21, 20,10,1999, "Pedro Inácio");
		Pessoa alb = new Pessoa(0, 14,13,1879, "Albert Eistein");
		
		List<Pessoa> pessoa = new ArrayList<Pessoa>();
		
		Departamento d = new Departamento("ICEN", pessoa);
		d.adicionarDep(pessoa, p);
		d.adicionarDep(pessoa, alb);
		
		Pessoa mar = new Pessoa(1, 7,11,1867, "Marie Curie");
		Pessoa carl = new Pessoa(0, 9,11,1934, "Carl Sagan");
		
		List<Pessoa> pess = new ArrayList<Pessoa>();
		
		Departamento da = new Departamento("CIAC", pess);
		da.adicionarDep(pess, mar);
		da.adicionarDep(pess, carl);
		
		Pessoa charl = new Pessoa(12, 12,02,1809, "Charles Darwin");
		Pessoa isa = new Pessoa(0, 4,1,1643, "Isaac Newton");
		
		List<Pessoa> pes = new ArrayList<Pessoa>();
		
		Departamento de = new Departamento("RH", pes);
		de.adicionarDep(pes, charl);
		de.adicionarDep(pes, isa);
		
		List<Departamento> dep = new ArrayList<Departamento>();
		
		Universidade uni = new Universidade("UFPA", dep);;
		
		uni.adicionarDep(dep, d);
		uni.adicionarDep(dep, da);
		uni.adicionarDep(dep, de);
		
		
		System.out.printf("Universidade: %s%n", uni.uniNome());
		uni.getDeps();
	}
}