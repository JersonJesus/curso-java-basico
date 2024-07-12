package com.ronin.cursojava.aula19.labs;

import java.util.Random;

/*32. Criar um vetor A com 5 elementos inteiros. Escreva um programa que
imprima a tabuada de cada um dos elementos do vetor A.*/

public class Exer32 {

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
			System.out.println("=======================");
			System.out.println("Gerando a tabuada de "  + vetor[i] + ": ");
			System.out.println("=======================");
			for (int j = 1; j <= 10; j++) {
				System.out.println(vetor[i] + " X " + j + " = " + (vetor[i] * j));
			}
		}
		System.out.println("=======================");
	}

}
