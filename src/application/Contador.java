package application;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Primeiro Paramentro: ");
		int parametroUm = sc.nextInt();
		System.out.print("Digite o Segundo Parametro: ");
		int parametroDois = sc.nextInt();
		
		try {
			contar(parametroUm,parametroDois);
		}catch(ParametrosInvalidosException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();
	}
		
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if(parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");		
		}
		System.out.println();
		int contagem = parametroDois - parametroUm;
		for(int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o Numero " + i );
		}
		
	}
}
