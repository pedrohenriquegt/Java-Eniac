package Aula12;

public class Piloto implements Contrato{
	private String nome;
	
	public void setNome(String _nome) {
		this.nome = _nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public void Regra01() {
		System.out.println(this.getNome() + " deve dormir 8 horas antes da corrida");
		
	}

	@Override
	public void Regra02() {
		System.out.println(this.getNome() + " nao pode estar acima do peso");
		
	}

}
