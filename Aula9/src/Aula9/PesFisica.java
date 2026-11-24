package Aula9;

public class PesFisica extends Pessoas{
	private String cpf;
	
	public void setCPF(String _cpf) {
		this.cpf = _cpf;
	}
	
	public String getCPF() {
		return this.cpf;
	}
	
	//METODO CONSTRUTOR SEM PARAMETRO
	public PesFisica() {
		super();//carregar o metodo construtor da classe pai
		this.setCPF(" ");
		
	}
	//METODO CONSTRUTOR com PARAMETRO
	public PesFisica(int _idPessoa, String _nome, String _cpf) {
		super(_idPessoa, _nome);//carregar o metodo construtor da classe pai
		this.setCPF(_cpf);
			
	}
	public void MostrarDados() {
		super.MostrarDados();
		System.out.println(this.cpf);
	}
}
