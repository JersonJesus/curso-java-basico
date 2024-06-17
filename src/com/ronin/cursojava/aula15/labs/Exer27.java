package com.ronin.cursojava.aula15.labs;
/*27. Uma fruteira está vendendo frutas com a seguinte tabela de preços:
Até 5 Kg Acima de 5 Kg
Morango R$ 2,50 por Kg R$ 2,20 por Kg
Maçã R$ 1,80 por Kg R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
compra ultrapassar R$ 25,00, receberá ainda um desconto de
10% sobre este total. Escreva um algoritmo para ler a
quantidade (em Kg) de morangos e a quantidade (em Kg) de
maças adquiridas e escreva o valor a ser pago pelo cliente.*/

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantidade de Maçãs (Kg): ");
		double qtdMaca = input.nextDouble();
		
		System.out.print("Quantidade de Morango (Kg): ");
		double qtdMorango = input.nextDouble();
		
		double precoMaca = 0,
			   precoMorango = 0;
		
		double totalPagar = 0; 
		
		if (qtdMorango <= 5) {
			precoMorango = 2.50;
		} else {
			precoMorango = 2.20;
		}
		
		if (qtdMaca <= 5) {
			precoMaca = 1.80;
		} else {
			precoMaca = 1.50;
		}
		
		double precoParcial = (precoMaca * qtdMaca) + (precoMorango * qtdMorango),
			   pesoTotal = qtdMaca + qtdMorango;
		
		totalPagar = precoParcial;
		
		if(pesoTotal > 8 || precoParcial > 25) {
			totalPagar = precoParcial - ((precoParcial * 10) / 100);
		}
		
		System.out.println("Total a Pagar: $" + totalPagar);
		
		input.close();

	}

}
