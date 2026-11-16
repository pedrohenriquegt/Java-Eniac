package Aula4;

public class Cao {
	//Atributos
	float altura, peso;
	String comida;
	
	//metodos getters(Leitura) e setters(Atribuir)
	//Getters
	float getAltura() {
		return this.altura;
	}
	float getPeso() {
		return this.peso;
	}
	String getComida() {
		return this.comida;
	}
	
	
	//Setters
	void setAltura(float _altura) {
		this.altura = _altura;
	}
	void setPeso(float _peso) {
		this.peso = _peso;
	}
	void setComida(String _comida) {
		this.comida = _comida;
	}
	
	
	//Metodos
	void Correr() {
		System.out.println("Cachorro Correr");
	}
	
	void Latir() {
		System.out.println("Cachorro Latir");
	}
	
	void Morder() {
		System.out.println("Cachorro Morder");
	}
}
