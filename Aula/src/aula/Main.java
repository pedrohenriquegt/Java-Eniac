package aula;

public class Main {

	public static void main(String[] args) {
		// criar objetos da classe veiculos
		// Nome_da_classe Nome_do_objeto = new Nome_da_Classe();
		
		Veiculos corsa = new Veiculos();
		corsa.placa = "ABC-2424";
		corsa.marca = "seila";
		corsa.modelo = "Corsa";
		corsa.cor = "Vermelho";
		corsa.anoFab = 2013;
		
		corsa.acelerar();
		corsa.frear();
		corsa.mostrarDados();
		
		Veiculos carro2 = new Veiculos();
		
	}

}
