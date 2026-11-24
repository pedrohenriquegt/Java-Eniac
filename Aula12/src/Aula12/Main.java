package Aula12;

public class Main {

	public static void main(String[] args) {
		//Criando os obj da classe
		Jogador jogador1 = new Jogador();
		jogador1.setNome("Pedro");
		
		//chamar o metodo
		jogador1.Regra01();
		jogador1.Regra02();
		jogador1.Regra03();
		
		Piloto piloto1 = new Piloto();
		piloto1.setNome("Pietro");
		piloto1.Regra01();
		piloto1.Regra02();
	}

}
