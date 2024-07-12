package com.ronin.cursojava.aula19.labs;
/*33. Criar um vetor A com 10 elementos inteiros. Escreva um programa que
imprima cada elemento do vetor A e uma mensagem indicando se o
respectivo elemento é um número primo ou não.*/

import java.util.Random;

public class Exer33 {

	public static void main(String[] args) {
		
		Random rand = new Random(); 
		int[] vetor = {9,3,4,5,6};
		
		System.out.print("Gerando os valores = ");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("[" + vetor[i] + "] ");
		}
		
		System.out.println();
		
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 2; j < vetor[i]; j++) {
				if(vetor[i] % j == 0) {
					System.out.println(vetor[i] + " não é Primo");
					break;
				} else {
					System.out.println(vetor[i] + " é Primo");
					break;
				}
			}		
		}
	}

}
