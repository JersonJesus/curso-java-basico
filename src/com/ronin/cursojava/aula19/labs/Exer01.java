package com.ronin.cursojava.aula19.labs;

/*1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
seja, B[i] = A[i].*/

public class Exer01 {
	public static void main(String[] args) {
		
		int[] vetorA = {3,4,7,6,1},
			  vetorB = new int [5];
		
		
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = vetorA[i];		
		}
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		
		
		
	}
}
