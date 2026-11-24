package Aula9;

public class Pessoas {
	protected int idPessoa;
	protected String nome;
	
	//getters e setters
	public int getIdPessoa() {
		return this.idPessoa;
	}
	
	public void setIdPessoa(int _idPessoa) {
		this.idPessoa = _idPessoa;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String _nome) {
		this.nome = _nome;
	}
	//metodo construtor - sem parametros
	public Pessoas() {
		this.setIdPessoa(0);
		this.setNome("");
	}
	
	//metodo construtor - com parametros
	public Pessoas(int _idPessoa, String _nome) {
		this.setIdPessoa(_idPessoa);
		this.setNome(_nome);
	}
	
	//metodo para exibir os dados na tela
	public void MostrarDados() {
		System.out.println(this.idPessoa);
		System.out.println(this.nome);
	}
}
