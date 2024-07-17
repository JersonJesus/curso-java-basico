package com.ronin.cursojava.aula20;
import java.util.Scanner;
/*Escreva um programa para armazenar dados de umapesquisa
  feita com uma amostra de pessoas da rua mais movimentada
  da cidade em que vc vive.
  
  Apesquisa consiste em perguntar quantos filhos tem 
  e quais são os seus nomes.
  
  *Guarde essas informações em uma matriz de forma que 
  a pessoa entrevistada ocupe apenas o espaço
  necessário para guardar os nomes do filho.
  
  Imprima a qtd de pessoas entrevistadas,
  o número de filhos de cada e seus respetivos nomes. */
public class MatrizIrregularExer {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Número de pessoas entrevistadas: ");
		int numPessoasEntrevistadas = input.nextInt();
		
		String[][] matrizNomes = new String[numPessoasEntrevistadas][];
		
		int numFilhos = 0;
		
		for (int i = 0; i < matrizNomes.length; i++) {
			
			System.out.print("Número de filhos da " + (i+1) + "ª pessoa: ");
			numFilhos = input.nextInt();
			
			matrizNomes[i] = new String[numFilhos];
			
			for (int j = 0; j < matrizNomes[i].length; j++) {
				System.out.print("Nome do " + (j+1) + "º filho: ");
				matrizNomes[i][j] = input.next();
			}
		}
		
		System.out.println("==========RÉLATÓRIO FINAL==========");
		
		System.out.println("Número de entrevistados: " + numPessoasEntrevistadas);
		
		for (int i = 0; i < matrizNomes.length; i++) {
			System.out.println("A " + (i+1) + "ª pessoa tem " + matrizNomes[i].length + " filhos.");
			for (int j = 0; j < matrizNomes[i].length; j++) {
				System.out.println("Nome do " + (j+1) + "º filho: " + matrizNomes[i][j]);
			}
		}
		System.out.println("");
		input.close();
	}

}
