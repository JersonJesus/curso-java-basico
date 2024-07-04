package com.ronin.cursojava.aula19.labs;
/*26. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C de mesmo tipo e tamanho, obedecendo as seguintes
regras de formação: a) Ci deverá receber 1 quando Ai for maior que Bi;
b) Ci deverá receber 0 quando Ai for igual a Bi; c) Ci deverá receber -1
quando Ai for menor que Bi.*/



public class Exer26 {

	public static void main(String[] args) {

		int[] vetorA = new int[6],
		      vetorB = new int[vetorA.length],
		      vetorC = new int[vetorA.length];
		
		System.out.print("VetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random() * 50);
			System.out.print("[" + vetorA[i] + "] ");
		}
		
		System.out.println();
		
		System.out.print("VetorB = ");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = (int) Math.round(Math.random() * 50);
			System.out.print("[" + vetorB[i] + "] ");
		}
		
		System.out.println();
		
		System.out.print("VetorC = ");
		for (int i = 0; i < vetorC.length; i++) {
			if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			} else if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			} else {
				vetorC[i] = -1;
			}
			System.out.print("[" + vetorC[i] + "] ");
		}
	}

}
