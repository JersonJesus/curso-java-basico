package com.ronin.cursojava.aula19.labs;
/*13. Criar um vetor A com 10 elementos inteiros. Implementar um programa
que determine a soma dos elementos armazenados neste vetor que
são múltiplos de 5.*/

import java.util.Random;

public class Exer13 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] vetorA = new int[5];
		
		System.out.print("Vetor A =");
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = rand.nextInt(20) + 1;
			
			System.out.print("[" + vetorA[i] + "]");
			
		}
		
		System.out.println();
		
		boolean ehMultiplo5 = false;
		
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 5 == 0) {
				ehMultiplo5 = true;
				System.out.println("[" + vetorA[i] + "] é múltiplo de 5.");
			}
		}
		
		if (!ehMultiplo5) {
			System.out.print("Nenhum dos valores no vetor é multiplo de 5.");
			
		}

	}

}
