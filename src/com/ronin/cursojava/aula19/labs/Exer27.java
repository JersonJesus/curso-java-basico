package com.ronin.cursojava.aula19.labs;
/*27. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
a) Bi deverá receber 'a' quando Ai for menor que 7; b) Bi deverá
receber 'b' quando Ai for igual a 7; c) Bi deverá receber 'c' quando Ai for
maior que 7 e menor que 10; d) Bi deverá receber 'd' quando Ai for
igual a 10; e e) Bi deverá receber 'e' quando Ai for maior que 10.
Sugestão: char B[10];*/

public class Exer27 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[6];
	
		System.out.print("VetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random() * 15);
			System.out.print("[" + vetorA[i] + "] ");
		}
		
		
		String[] vetorB = new String[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] < 7) {
				vetorB[i] = "a";
			} else if (vetorA[i] == 7) {
				vetorB[i] = "b";
			} else if (vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = "c";
			} else if (vetorA[i] == 10) {
				vetorB[i] = "d";
			} else {
				vetorB[i] = "e";
			}
		}
		
		System.out.println();
		
		System.out.print("VetorB = ");
		for (String valVetorB : vetorB) {
			System.out.print("[" + valVetorB + "] ");
		}
	}

}
