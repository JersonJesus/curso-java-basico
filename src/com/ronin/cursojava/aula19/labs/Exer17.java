package com.ronin.cursojava.aula19.labs;
/*17. Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a quantidade de pessoas que possuem idade superior a 35
anos.*/

import java.util.Random;

public class Exer17 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] vetorA = new int[10];
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(i+1 + "ª Idade: ");
			System.out.println(vetorA[i] = rand.nextInt(50) + 1); 	
		}
		
		System.out.println();
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("[" + vetorA[i] + "] ");
		}
		
		System.out.println();
		
		int qtdPessoas35 = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] > 35) {
				qtdPessoas35++;
			}
		}
		
		System.out.println("Pessoas que possuem idade superior a 35 anos: " + qtdPessoas35);

	}

}
