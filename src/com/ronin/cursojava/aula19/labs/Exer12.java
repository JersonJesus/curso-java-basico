package com.ronin.cursojava.aula19.labs;
/*12. Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados
neste vetor.*/

import java.util.Random;

public class Exer12 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] vetorA = new int[5];
		
		System.out.print("Vetor A =");
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = rand.nextInt(20) + 1;
			
			System.out.print("[" + vetorA[i] + "]");
			
		}
		
		System.out.println();
		
		int somaValores = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
				somaValores += vetorA[i];
			}
		
		System.out.print("Soma Total dos valores no vetorA: " + somaValores);
	
	}

}
