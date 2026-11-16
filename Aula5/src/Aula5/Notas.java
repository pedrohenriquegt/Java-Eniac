package Aula5;

public class Notas {
	int RA;
	String disciplina;
	float mediaExercicios, notaTD, notaProva, mediaFinal;
	
	//getters e setters
	//getters
	int getRA() {
		return this.RA;
	}
	String getDisciplina() {
		return this.disciplina;
	}
	float getMediaExercicios() {
		return this.mediaExercicios;
	}
	float getNotaTD() {
		return this.notaTD;
	}
	float getNotaProva() {
		return this.notaProva;
	}
	float getMediaFinal() {
		return this.mediaFinal;
	}
	
	//setters
	void setRA(int _ra) {
		this.RA = _ra;
	}
	void setDisciplina(String _disciplina) {
		this.disciplina = _disciplina;
	}
	void setMediaExercicios(float _mediaExercicios) {
		this.mediaExercicios = _mediaExercicios;
	}
	void setNotaTD(float _notaTD) {
		this.notaTD = _notaTD;
	}
	void setNotaProva(float _notaProva) {
		this.notaProva = _notaProva;
	}
	void setMediaFinal(float _mediaFinal) {
		this.mediaFinal = _mediaFinal;
	}
	
	void MostrarDados() {
		System.out.println("RA: " + this.getRA());
		System.out.println("Disciplina: " + this.getDisciplina());
		System.out.println("Media Exercicios: " + this.getMediaExercicios());
		System.out.println("Nota do Teste de Desempenho: " + this.getNotaTD());
		System.out.println("Nota de Prova: " + this.getNotaProva());
		System.out.println("Media Final: " + this.getMediaFinal());
	}
	
}
