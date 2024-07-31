package com.ronin.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		char[][] matriz = new char[3][3];

		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O\n");

		int numJogada = 1, // numero de jogadas
				linha = 0, // numero da linha
				coluna = 0; // numero da coluna

		boolean gameOver = false;// define se o jogo terminou
				 
	; // define se a coluna escolhida é válida

		char sinal;

		do {
			// Faz a troca de jogadores
			if (numJogada % 2 == 1) {
				System.out.println("JOGADOR 1");
				System.out.println("Escolha uma linha e uma coluna (1-3)");
				sinal = 'X';
			} else {
				System.out.println("JOGADOR 2");
				System.out.println("Escolha uma linha e uma coluna (1-3)");
				sinal = 'O';
			}
			// Validar e fazer as jogadas
			boolean linhaValida = false;// define se a linha escolhida é válida
			
			do {
				System.out.print("Digite uma linha entre 1, 2 e 3: ");
				linha = input.nextInt();

				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Linha inválida, tente novamente!");
				}
			} while (!linhaValida);
			
			boolean colunaValida = false; // define se a COLUNA escolhida é válida
			do {
				System.out.print("Digite uma coluna entre 1, 2 e 3: ");
				coluna = input.nextInt();

				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Coluna inválida, tente novamente!");
				}
			} while (!colunaValida);

			linha--;
			coluna--;

			// Verificar se a jogada já foi feita em um lugar
			if (matriz[linha][coluna] == 'X' || matriz[linha][coluna] == 'O') {
				System.out.println("Jogada já feita, tente outra.");
			} else {
				matriz[linha][coluna] = sinal;
				numJogada++;
			}

			System.out.println();

			// Imprimir o tabuleiro
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print("[ " + matriz[i][j] + " ] ");
				}
				System.out.println();
			}

			System.out.println();

			//Verificar se tem uma vitória ou empate
			
			if (matriz[0][0] == 'X' && matriz[0][1] == 'X' && matriz[0][2] == 'X' ||//linha1
				matriz[1][0] == 'X' && matriz[1][1] == 'X' && matriz[1][2] == 'X' ||//linha2
				matriz[2][0] == 'X' && matriz[2][1] == 'X' && matriz[2][2] == 'X' ||//linha3
				matriz[0][0] == 'X' && matriz[1][0] == 'X' && matriz[2][0] == 'X' ||//coluna1
				matriz[0][1] == 'X' && matriz[1][1] == 'X' && matriz[2][1] == 'X' ||//coluna2
				matriz[0][2] == 'X' && matriz[1][2] == 'X' && matriz[2][2] == 'X' ||//coluna3
				matriz[0][0] == 'X' && matriz[1][1] == 'X' && matriz[2][2] == 'X' ||//diagonal1
				matriz[0][2] == 'X' && matriz[1][1] == 'X' && matriz[2][0] == 'X' ) {
				
				System.out.println("JOGADOR 1 VENCEU");
				gameOver = true;
																				
			} else if(matriz[0][0] == 'O' && matriz[0][1] == 'O' && matriz[0][2] == 'O' ||//linha1
				matriz[1][0] == 'O' && matriz[1][1] == 'O' && matriz[1][2] == 'O' ||//linha2
				matriz[2][0] == 'O' && matriz[2][1] == 'O' && matriz[2][2] == 'O' ||//linha3
				matriz[0][0] == 'O' && matriz[1][0] == 'O' && matriz[2][0] == 'O' ||//coluna1
				matriz[0][1] == 'O' && matriz[1][1] == 'O' && matriz[2][1] == 'O' ||//coluna2
				matriz[0][2] == 'O' && matriz[1][2] == 'O' && matriz[2][2] == 'O' ||
				matriz[0][0] == '0' && matriz[1][1] == '0' && matriz[2][2] == '0' ||//diagonal1
				matriz[0][2] == '0' && matriz[1][1] == '0' && matriz[2][0] == '0') {
				
				System.out.println("JOGADOR 2 VENCEU");
				gameOver = true;
				
			} else if(numJogada > 9) {
				System.out.println("EMPATE");
				gameOver = true;
			}
			
		} while (!gameOver);
		
		

		input.close();

	}

}
