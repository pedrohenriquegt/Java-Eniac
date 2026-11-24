package Aula11;

public abstract class Funcionario {
	protected int idade;
	protected String nome, setor;
	
	//metodos de acesso (getters e setters)
	public void setIdade(int _idade) {
		this.idade = _idade;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setNome(String _nome) {
		this.nome = _nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setSetor(String _setor) {
		this.setor = _setor;
	}
	public String getSetor() {
		return this.setor;
	}
	//metodo construtor - sem parametro
	public Funcionario() {
		this.setIdade(0);
		this.setNome("");
		this.setSetor("");
	}
	
	//metodo construtor - com parametro
	public Funcionario(int _idade, String _nome, String _setor) {
		this.setIdade(_idade);
		this.setNome(_nome);
		this.setSetor(_setor);
	}
	
	//metodo calculaSalario - abstract (Nao tem implementacao, ou seja, codigos)
	public abstract void calculaSalario();
}
