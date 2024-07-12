package com.ronin.cursojava.aula19.labs;
/*34. Criar um vetor A com 10 elementos inteiros. Escreva um programa que
imprima cada elemento do vetor A e a relação de todos os pares de 0
até o respectivo elemento.*/


import java.util.Random;

public class exer34 {

	public static void main(String[] args) {
		
		Random rand = new Random(); 
		int[] vetor = new int[5];
		
		System.out.print("Gerando os valores = ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rand.nextInt(10) + 1;
			System.out.print("[" + vetor[i] + "] ");
			
		}
		
		System.out.println();
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Relação de nºs pares de 0 á " + vetor[i] + ": ");
			for (int j = 2; j <= vetor[i]; j++) {
				if (j % 2 == 0) {
					System.out.print(j + " - ");
				}
				
			}
			System.out.println("FIM");
			
		}

	}

}
