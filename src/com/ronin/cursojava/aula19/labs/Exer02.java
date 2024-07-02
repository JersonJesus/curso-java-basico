package com.ronin.cursojava.aula19.labs;
/*2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2.*/


public class Exer02 {

	public static void main(String[] args) {
		
		int[] vetorA = {2,4,6,5,8,3,1,7};
		int[] vetorB = new int[8];
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("[" + vetorA[i] + "]");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("[" + (vetorB[i] = vetorA[i] * 2 )+ "]");
		}
	}

}
