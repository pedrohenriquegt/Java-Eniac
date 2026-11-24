package Aula11;

public class Lider extends Funcionario{
	
	//criando a variavel de instancia
	private String tribo;
	
	//metodos de acesso(get e set)
	public void setTribo(String _tribo) {
		this.tribo = _tribo;
	}
	public String getTribo() {
		return this.tribo;
	}
	
	//metodo construtor - sem parametro
	public Lider() {
		super();
		this.setTribo("");
	}
	
	public Lider (int _idade, String _nome, String _setor, String _tribo) {
		super(_idade,_nome,_setor);
		this.setTribo(_tribo);
		
	}

	@Override
	public void calculaSalario() {
		// TODO Auto-generated method stub
		
	}

}
