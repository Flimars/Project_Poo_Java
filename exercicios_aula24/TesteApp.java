package exercicios_aula24;

import java.util.Scanner;

public class TesteApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Onde posso compra a lâmpada da promoção?");
		System.out.println("Segue as informações do catalogo, para te auxiliar.");
		System.out.println("=======================================================");
		Lampada lamp1 = new Lampada("Supermecado AquiTem", "Osram", 220, 15, 5.99);
		System.out.println("Onde Comprar: " + lamp1.onde_comprar);
		System.out.println("Descrições do produto Lâmpada (PROMOÇÃO): ");
		System.out.println("Fabricante: " + lamp1.fabricante);
		System.out.println("PROMOCÃO HOJE por R$ " + lamp1.preco);
		System.out.println("Tensão: " + lamp1.tensao + " Volts");
		System.out.println("Potência: " + lamp1.potencia + " Watts");
		System.out.println("=======================================================");
		System.out.println("=======================================================");
		 System.out.println("Teste a lâmpada antes de passar no caixa.");
		 lamp1.acender();
		 
		 if(lamp1.acesa == true) {
			 System.out.println("Lâmpada funciona perfeitamente!");
		 }else {
			 System.out.println("Lampada com defeito. Tirar do carrinho.");
		 }	
		 lamp1.apagar();
		 System.out.println("=======================================================");
	}	
		
}
