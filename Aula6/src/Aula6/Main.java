package Aula6;

public class Main {

	public static void main(String[] args) {
		//criando o objeto aluno
		Alunos aluno1 = new Alunos();
		aluno1.setMatricula(04122001);
		aluno1.setNome("Pedro");
		aluno1.setNota(8.9);
		Alunos.incrementarTotalAlunos();
		
		Alunos aluno2 = new Alunos();
		aluno2.setMatricula(1651461);
		aluno2.setNome("Calra");
		aluno2.setNota(5);
		Alunos.incrementarTotalAlunos();
		
		//consultando os objetos
		System.out.println(aluno1.getNome() + aluno1.getNota() + aluno1.isAprovado());
		System.out.println(aluno2.getNome() + aluno2.getNota() + aluno2.isAprovado());
		
		//exibir os membros da classe
		System.out.println(Alunos.getTotalAlunos());
		System.out.println(Alunos.getMediaAprovacao());
	}

}
