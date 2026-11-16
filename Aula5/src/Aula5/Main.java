package Aula5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//criar um objeto da classe Scanner
		Scanner entrada = new Scanner(System.in);
		
		//criando o objeto notas
		// Classe objeto = new Construtor();
		Notas nota1 = new Notas();
		
		System.out.print("Digite o seu RA: ");
		nota1.setRA(entrada.nextInt());
		
		System.out.print("Digite a discuplina: ");
		nota1.setDisciplina(entrada.next());
		
		System.out.print("Digite a Media do exercicios: ");
		nota1.setMediaExercicios(entrada.nextFloat());
		
		System.out.print("Digite a nota do Teste de Desempenho: ");
		nota1.setNotaTD(entrada.nextFloat());
		
		System.out.print("Digite a nota da Prova: ");
		nota1.setNotaProva(entrada.nextFloat());
		
		float mediaFinal = (nota1.getMediaExercicios() + nota1.getNotaTD() + nota1.getNotaProva()) / 3;
		nota1.setMediaFinal(mediaFinal);
		
		nota1.MostrarDados();
	}

}
