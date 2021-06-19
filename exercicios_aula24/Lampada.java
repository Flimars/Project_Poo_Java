package exercicios_aula24;

class Lampada {
	String onde_comprar;
	String fabricante;
	int tensao;
	int potencia;
	double preco;
	boolean acesa;
	
	Lampada(String onde_comprar, String fabricante, int tensao, int potencia, double preco){
		this.onde_comprar = onde_comprar;
		this.fabricante = fabricante;
		this.tensao = tensao;
		this.potencia = potencia;
		this.preco = preco;
	}
	
	void acender() {
		this.acesa = true;
	}
	
	void apagar() {
		this.acesa = false;
	}
}

