package com.ronin.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int primeiroTermo = 1,
			segundoTermo = 1,
			termoSeguinte = 0,
			numeroDeTermos;
		
		System.out.print("Deseja gerar quantos termos: ");
		numeroDeTermos = input.nextInt();
		
		for(int i = 1; i <= numeroDeTermos; i++) {
			System.out.print(segundoTermo + " - ");
			termoSeguinte = primeiroTermo + segundoTermo;
			segundoTermo = primeiroTermo;
			primeiroTermo = termoSeguinte;
		}
		System.out.println("FIM");
		
		input.close();

	}

}
