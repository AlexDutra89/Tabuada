package Projetos;

import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("Informe outro número inteiro: ");
		int numero2 = entrada.nextInt();
		
		int resultado = numero1 * numero2;
		
		System.out.println(resultado);
		
		entrada.close();
		
		
		
	}

}
