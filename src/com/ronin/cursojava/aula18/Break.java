package com.ronin.cursojava.aula18;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int [] vetor = {3,7,1,9,6};
		
		boolean encontrado = false;
		System.out.print("Digite o valor desejado: ");
		int valor = input.nextInt();
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] == valor) {
				encontrado = true;
				System.out.println("Valor " + vetor[i] + " encontrado na posição " + i);
				break;
			}
		}
		
		if (!encontrado) {
				System.out.println("Valor não encontrado.");

		}
	
		input.close();
		
	}

}
