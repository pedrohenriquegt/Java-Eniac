package Aula6;

public class Alunos {
	//atributos de instancia (objeto) - private (encapsulamento)
	private int matricula;
	private String nome;
	private double nota;
	
	//atributos de classe (estatico)
	private static int totalAlunos = 0;
	private static double mediaAprovacao = 6.0;
	
	//metodo de instancia (getters e setters)
	public int getMatricula() {
		return this.matricula;
	}
	public void setMatricula(int _matricula) {
		this.matricula = _matricula;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String _nome) {
		this.nome = _nome;	
	}
	
	
	public double getNota() {
		return this.nota;
	}
	public void setNota(double _nota) {
		//validacao da nota
		if (_nota >= 0.0 && _nota <= 10) {
			this.nota = _nota;
		}
	}
	
	public boolean isAprovado() {
		return this.nota >= Alunos.mediaAprovacao;
	}
	
	public static int getTotalAlunos() {
		return Alunos.totalAlunos;
	}
	
	public static void incrementarTotalAlunos() {
		Alunos.totalAlunos++;
	}
	
	public static double getMediaAprovacao() {
		return Alunos.mediaAprovacao;
	}
	public static void setMediaAprovacao (double _media) {
		if (_media >= 0.0 && _media <= 10.0) {
			Alunos.mediaAprovacao = _media;
		}
	}
}

