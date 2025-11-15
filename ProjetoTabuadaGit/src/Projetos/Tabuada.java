package Projetos;

import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o número que será multiplicado: ");
		int numero = entrada.nextInt();
		
		System.out.print("Digite o número máximo para tabuada: ");
		int numeroMaximo = entrada.nextInt();
		
		for(int i=0; i<=numeroMaximo; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}
	
		entrada.close();
		
	}
	
}
