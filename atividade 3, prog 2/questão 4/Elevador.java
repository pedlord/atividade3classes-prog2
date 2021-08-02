
public class Elevador {
	private int andarAtual;
	private int pessoasAtuais;
	private int capacidade;
	private int TotalAndares;
	
	public Elevador() {
		this.andarAtual = 0;
		this.pessoasAtuais = 0;
	}
	void Inicializa(int capacidade, int TotalAndares){
		setCapacidade(capacidade);
		setTotalAndares(TotalAndares);
	}
	void Entra(){
		if (this.pessoasAtuais < this.capacidade) {
			this.setPessoasAtuais(this.getPessoasAtuais() + 1);
		}
		else {
			System.out.println("sem espaço");
		}
	}
	void Sai(){
		if (this.pessoasAtuais != 0) {
			this.setPessoasAtuais(this.getPessoasAtuais() - 1);
		}
		else {
			System.out.println("não há ninguém no elevador para sair");
		}
	}
	void Sobe(){
		if (this.andarAtual != this.TotalAndares) {
			this.setAndarAtual(this.getAndarAtual() + 1);
			//this.andarAtual++;
		}
		else {
			System.out.println("Está no ultimo andar");
		}
	}
	void Desce(){
		if (this.andarAtual != 0) {
			this.setAndarAtual(this.getAndarAtual() - 1);
		}
		else {
			System.out.println("Está no térreo, não há como descer");
		}
	}
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getPessoasAtuais() {
		return pessoasAtuais;
	}
	public void setPessoasAtuais(int pessoasAtuais) {
		this.pessoasAtuais = pessoasAtuais;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getTotalAndares() {
		return TotalAndares;
	}
	public void setTotalAndares(int TotalAndares) {
		this.TotalAndares = TotalAndares;
	}
	public static void main(String args[]) throws Exception
	{
		Elevador elv = new Elevador();
		int cap = 5;
		int totAnd = 4;
		
		elv.Inicializa(cap, totAnd);
		System.out.println("capacidade do elevador: " + elv.getCapacidade());
		System.out.println("total de andares: " + elv.getTotalAndares());
		System.out.println("andar atual: " + elv.getAndarAtual());
		System.out.println("Nº de pessoas atuais: " + elv.getPessoasAtuais());
		System.out.println("entra uma pessoa");
		elv.Entra();
		System.out.println("Nº de pessoas atuais: " + elv.getPessoasAtuais());
		System.out.println("tentou descer um andar:");
		elv.Desce();
		System.out.println("andar atual: " + elv.getAndarAtual());
		System.out.println("sobe um andar");
		elv.Sobe();
		System.out.println("andar atual: " + elv.getAndarAtual());
		System.out.println("desce um andar");
		elv.Desce();
		System.out.println("andar atual: " + elv.getAndarAtual());
		System.out.println("sai uma pessoa");
		elv.Sai();
		System.out.println("Nº de pessoas atuais: " + elv.getPessoasAtuais());
		System.out.println("sai uma pessoa/fantasma:");
		elv.Sai();
	}
}
