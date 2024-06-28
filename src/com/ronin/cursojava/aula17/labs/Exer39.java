package com.ronin.cursojava.aula17.labs;
/*39. Faça um programa que leia dez conjuntos de dois valores, o primeiro
representando o número do aluno e o segundo representando a sua
altura em centímetros. Encontre o aluno mais alto e o mais baixo.
Mostre o número do aluno mais alto e o número do aluno mais baixo,
junto com suas alturas.*/

import java.util.Scanner;

public class Exer39 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String num;
		double altura;
		
		String numAlto = " ";
		double alturaAlto = Double.MIN_VALUE;
		
		String numBaixo  = " ";
		double alturaBaixo = Double.MAX_VALUE;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("=====" + i + "º Aluno=====");
			
			System.out.print("Número: ");
			num = input.next();
			
			System.out.print("Altura: ");
			altura = input.nextDouble();
			
			System.out.println("==================");
			
			//VERIFICANDO O MAIS ALTO
			if(altura > alturaAlto) {
				numAlto = num;
				alturaAlto = altura;
			}
			
			//VERIFICANDO O MAIS ALTO
			if(altura < alturaBaixo) {
				numBaixo = num;
				alturaBaixo = altura;
			}
		}
		
		
		System.out.println("\n====Mais Alto====");
		System.out.println("Número: " + numAlto);
		System.out.println("Altura: " + alturaAlto);
		
		System.out.println("====Mais Baixo====");
		System.out.println("Número: " + numBaixo);
		System.out.println("Altura: " + alturaBaixo);
		
		input.close();
	}

}
