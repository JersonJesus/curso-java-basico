package com.ronin.cursojava.aula19.labs;
/*25. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
a) Bi deverá receber 1 quando Ai for par; b) Bi deverá receber 0
quando Ai for ímpar.*/

public class Exer25 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[6],
			  vetorB = new int[vetorA.length];
		
		
		System.out.print("VetorA = ");
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] =(int) Math.round(Math.random() * 50);
			System.out.print("[" + vetorA[i] + "] ");
		}
		
		System.out.print("\nVetorB = ");
		
		for (int i = 0; i < vetorB.length; i++) {
			if (vetorA[i] % 2 == 0) {
				vetorB[i] = 1;
			} else {
				vetorB[i] = 0;
			}
			
			System.out.print("[" + vetorB[i] + "] ");
		}
	}

}
