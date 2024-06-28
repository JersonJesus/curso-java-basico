package com.ronin.cursojava.aula17.labs;
/*16. A série de Fibonacci é formada pela seqüência
0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até
que o valor seja maior que 500.*/


public class Exer16 {

	public static void main(String[] args) {
		
		
		
		int primeiroTermo = 1,
			segundoTermo = 1,
			termoSeguinte = 0;
			
		
		while (primeiroTermo <= 500) {
			
			System.out.print(primeiroTermo + " - ");
			termoSeguinte = primeiroTermo + segundoTermo;
			segundoTermo = primeiroTermo;
			primeiroTermo = termoSeguinte;
			
		}
			
		System.out.println("FIM");
		
		


	}

}
