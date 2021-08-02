
public class principal {
	public static void main(String args[]) throws Exception
	{
		Pessoa alb = new Pessoa(0, 14,13,1879, "Albert Eistein");
		Pessoa isa = new Pessoa(0, 4,1,1643, "Isaac Newton");

		alb.calculaIdade(31, 7, 2021);
		isa.calculaIdade(31, 7, 2021);
		System.out.println(alb.informaNome() + ", idade: " + alb.informaIdade());
		System.out.println(isa.informaNome() + ", idade: " + isa.informaIdade());
		
		System.out.printf("%nAjustando a data de nascimento de Albert para 20/10/1999%n");
		alb.ajustaDataDeNascimento(20, 10, 1999);
		System.out.println("calculando...");
		alb.calculaIdade(2, 8, 2021);
		System.out.println(alb.informaNome() + ", idade: " + alb.informaIdade());
	}
}
