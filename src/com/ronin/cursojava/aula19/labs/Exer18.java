package com.ronin.cursojava.aula19.labs;
/*18. Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a menor e a maior idades e suas respectivas posições.*/

import java.util.Random;

public class Exer18 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] vetorIdade = new int[10];
		
		for (int i = 0; i < vetorIdade.length; i++) {
			System.out.print(i+1 + "ªIdade: ");
			System.out.println(vetorIdade[i] = rand.nextInt(50) + 1); 	
		}
		
		System.out.println();
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorIdade.length; i++) {
			System.out.print("[" + vetorIdade[i] + "] ");
		}
		
		System.out.println();
		
		int maiorIdade = Integer.MIN_VALUE,
			menorIdade = Integer.MAX_VALUE,
			posMaior = 0,
			posMenor = 0;
		
		
		for (int i = 0; i < vetorIdade.length; i++) {
			if (vetorIdade[i] > maiorIdade) {
				maiorIdade = vetorIdade[i];
				posMaior = i;
			}
		}
		
		for (int i = 0; i < vetorIdade.length; i++) {
			if (vetorIdade[i] < menorIdade) {
				menorIdade = vetorIdade[i];
				posMenor = i;
			}
		}
		
		System.out.println("Maior Idade: " + maiorIdade + " | Posição no vetor: " + posMaior);
		System.out.println("Menor Idade: " + menorIdade + " | Posição no vetor: " + posMenor);
	}

}
