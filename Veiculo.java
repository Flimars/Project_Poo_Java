
class Veiculo {
	String tipo;
	String marca;
	String modelo;
	int numPassageiros;
	int numRodas;
	double capCombustivel;
	double consumoCombustivel;
	boolean possuiMotor;
	//método void sem retorno.
	void exibirAutonomia() {
		System.out.println("A  autonomia do carro é de: "+ capCombustivel * consumoCombustivel +" KM/L");		
	}
	//método tipado com retorno.
	double obterAutonomia() {
		return capCombustivel * consumoCombustivel;
	}
}
