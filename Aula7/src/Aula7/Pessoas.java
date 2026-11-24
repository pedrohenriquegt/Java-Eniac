package Aula7;

public class Pessoas {
	protected int cpf;
	protected String nome, email;
	
	public int getCpf() {
		return this.cpf;
	}
	public void setCpf(int _cpf) {
		this.cpf = _cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String _nome) {
		this.nome = _nome;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String _email) {
		this.email = _email;
	}
}
