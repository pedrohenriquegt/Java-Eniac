package aula;

public class Veiculos {
	String placa, marca, modelo, cor;
	int anoFab;
	
	//void = sem retorno
	void acelerar() {
		System.out.println("O veiculo esta acelerando, cuidado!");
	}
	void frear( ) {
		System.out.println("O veiculo esta freando!");
	}
	void mostrarDados() {
		System.out.println("Placa ..: " + placa);
		System.out.println("Marca ..: " + marca);
		System.out.println("Modelo .: " + modelo);
		System.out.println("Cor ....: " + cor);
		System.out.println("Ano ....: " + anoFab);
	}
}
