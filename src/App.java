package src;

public class App {

	public static void main(String[] args) {
		Veiculo car = new Veiculo();
		car.tipo = "automóvel";
		car.marca = "Volkswagem";
		car.modelo = "Gol";
		car.numPassageiros = 5;
		car.numRodas = 4;
		car.capCombustivel = 45.0;
		car.consumoCombustivel = 0.3;
		car.possuiMotor = true;
		
		System.out.println(car.tipo +" "+ car.marca +" "+ car.modelo);
		System.out.println(car.possuiMotor);
		car.exibirAutonomia();
		double autonomia = car.obterAutonomia();
		System.out.println("A  autonomia do carro é de: "+ autonomia);
	}

}
