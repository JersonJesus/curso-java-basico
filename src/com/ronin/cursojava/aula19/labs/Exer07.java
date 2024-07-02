package com.ronin.cursojava.aula19.labs;
/*7. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a subtração dos respectivos
elementos em A e B, ou seja:
C[i] = A[i] – B[i].*/
import java.util.Random;

public class Exer07 {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int[] vetorA = new int[5];
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = rand.nextInt(10) + 1;
			System.out.print("[" + vetorA[i] + "]");
		}
		
		System.out.println();
		
		int[] vetorB = new int[vetorA.length];
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = rand.nextInt(10) + 1;
			System.out.print("[" + vetorB[i] + "]");
		}
		
		System.out.println();
		
		int[] vetorC = new int[vetorA.length];
		
		System.out.print("Vetor C = ");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] - vetorB[i];
			System.out.print("[" + vetorC[i] + "]");
		}
	}

}
