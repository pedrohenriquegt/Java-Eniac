package Aula9;

public class Main {

	public static void main(String[] args) {
		Pessoas pes1 = new Pessoas();
		pes1.MostrarDados();

		Pessoas pes2 = new Pessoas(10, "pedro");
		pes2.MostrarDados();
		
		PesFisica pes3 = new PesFisica();
		pes3.MostrarDados();
		
		PesFisica pes4 = new PesFisica(123, "Pedro", "15165156151");
		pes4.MostrarDados();
	}

}
