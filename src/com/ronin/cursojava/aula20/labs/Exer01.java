package com.ronin.cursojava.aula20.labs;
/*1. Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
9. Após isso determine o maior número da matriz e a sua posição
(linha, coluna).*/

public class Exer01 {

	public static void main(String[] args) {

		int[][] matriz = new int[4][4];

		System.out.println("Gerando a Matriz: ");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) Math.round(Math.random() * 9);
				System.out.print("[" + matriz[i][j] + "] ");
			}
			System.out.println();
		}

		int maiorValor = Integer.MIN_VALUE, linha = 0, coluna = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > maiorValor) {
					maiorValor = matriz[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		System.out.println();
		System.out.println("Maior valor = " + maiorValor);
		System.out.println("Linha = " + linha);
		System.out.println("Coluna = " + coluna);

	}

}
