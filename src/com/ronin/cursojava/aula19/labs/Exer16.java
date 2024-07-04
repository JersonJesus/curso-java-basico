package com.ronin.cursojava.aula19.labs;
/*16. Criar um vetor A com 10 elementos inteiros. Escrever um programa
que calcule e escreva: a) a soma de elementos armazenados neste
vetor que são inferiores a 15; b) a quantidade de elementos
armazenados no vetor que são iguais a 15; e c) a média dos
elementos armazenados no vetor que são superiores a 15.*/

import java.util.Random;

public class Exer16 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] vetorA = new int[10];
		
		System.out.print("Vetor A =");
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = rand.nextInt(50) + 1;
			
			System.out.print("[" + vetorA[i] + "]");
			
		}
		
		System.out.println();
		
		int somaMenor15 = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] < 15) {
				somaMenor15 += vetorA[i];
			}
		}
		System.out.print("Soma dos elementos menores que 15: " + somaMenor15);
		
		System.out.println();
		
		int valorIgual15 = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] == 15) {
				valorIgual15++;
			}
		}
		System.out.print("Quantidade de elementos iguais a 15: " + valorIgual15);
		
		System.out.println();
		
		int valorMaior15 = 0,
				soma = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] > 15) {
				soma += vetorA[i];
				valorMaior15++;
			}
		}
		
		double media = (double)soma / valorMaior15; 
		System.out.print("Média dos elementos superiores a 15: " +  media);
		
	}

}
