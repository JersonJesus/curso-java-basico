package com.ronin.cursojava.aula19.labs;

import java.util.Scanner;

/*23. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que verifique se "todos" os elementos do vetor A são pares. Se pelo
menos um elemento do vetor não for par o processo de repetição para
percorrer os elementos do vetor deve ser encerrado, como sugestão:
utilize uma variável do tipo flag para atingir este propósito.*/

public class Exer23 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[5];
		
		Scanner input = new Scanner (System.in);
		
		
		for (int i = 0; i < vetorA.length; i++) {
			
				System.out.print("Digite o " + (i+1) + "º valor: ");
				vetorA[i] = input.nextInt();
				
				if(vetorA[i] % 2 != 0) {
					System.out.println("Programa Encerrado.");
					break;
					
				}	
		}
		
		input.close();

	}

}
