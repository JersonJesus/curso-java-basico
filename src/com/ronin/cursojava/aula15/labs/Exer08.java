package com.ronin.cursojava.aula15.labs;
/*8. Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato.*/
import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Preço do 1º Produto: ");
		double produto1 = input.nextDouble();
		
		System.out.print("Preço do 2º Produto: ");
		double produto2 = input.nextDouble();
		
		
		System.out.print("Preço do 3º Produto: ");
		double produto3 = input.nextDouble();
		
		double maisBarato;
		
		if(produto1 < produto2 && produto1 < produto3) {
			maisBarato = produto1;
		} else if(produto2 < produto1 && produto2 < produto3) {
			maisBarato = produto2;
		} else {
			maisBarato = produto3;
		}
		System.out.println("O produto mais barato custa " + maisBarato + "$");
		
		input.close();
		

	}

}
