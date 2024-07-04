package com.ronin.cursojava.aula19.labs;
/*24. Números palíndromos são aqueles que escritos da direita para a
esquerda têm o mesmo valor quando escritos da esquerda para a
direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um
programa que verifique se um dado vetor A de 10 elementos inteiros é
um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao
último, se o segundo elemento do vetor é igual ao penúltimo e assim
por diante até verificar todos os elementos ou chegar a conclusão que
o vetor não é um palíndromo.*/

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int[] vetorA = new int[6];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite o valor na posição " + i + ": ");
			vetorA[i] = input.nextInt();
			
		}	
		
		System.out.print("VetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("[" + vetorA[i] + "] ");
		}
		
		boolean ehPalindromo = true;
		
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] != vetorA[vetorA.length - 1 -i]) {
				ehPalindromo = false;
				System.out.println("\nNão é um Palíndromo");
				break;
			}
		}
		
		
		if(ehPalindromo) {
			System.out.println("\nÉ um Palíndromo");
		}
		
		input.close();
		
	}

}
