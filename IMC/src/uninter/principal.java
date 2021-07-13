package uninter;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		System.out.println("Por favor digite o seu peso (kg):");
		Scanner teclado = new Scanner(System.in);
		
		float peso = teclado.nextFloat();
		
		System.out.println("Digite sua altura (m):");
		
		float altura = teclado.nextFloat();
		
		float imc = peso / (altura*altura); // posso escrever "altura*altura" ou Math.pow(altura,2)
		
		System.out.println("Seu IMC é: " + imc);
		
				
		

	}

}
