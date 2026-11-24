package Aula12;

public class Jogador implements Contrato, Contrato2{
	private String nome;
	
	public void setNome(String _nome) {
		this.nome = _nome;
	}
	public String getNome() {
		return this.nome;
	}

	@Override
	public void Regra01() {
		System.out.println(this.getNome() + " nao pode andar de moto");
		
	}

	@Override
	public void Regra02() {
		System.out.println(this.getNome() + " nao pode sair");
		
	}
	@Override
	public void Regra03() {
		System.out.println(this.getNome() + " se marcar gol, aumento de salario");
		
	}
	
}
