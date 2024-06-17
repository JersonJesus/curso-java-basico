package com.ronin.cursojava.aula15.labs;
/*28. O Hipermercado Tabajara está com uma promoção de carnes que é
imperdível. Confira:
o Até 5 Kg Acima de 5 Kg
o
File Duplo R$ 4,90 por Kg R$ 5,80 por Kg
o
Alcatra R$ 5,90 por Kg R$ 6,80 por Kg
o
Picanha R$ 6,90 por Kg R$ 7,80 por Kg
Para atender a todos os clientes, cada cliente poderá levar
apenas um dos tipos de carne da promoção, porém não há
limites para a quantidade de carne por cliente. Se compra for
feita no cartão Tabajara o cliente receberá ainda um desconto
de 5% sobre o total a compra. Escreva um programa que peça
o tipo e a quantidade de carne comprada pelo usuário e gere
um cupom fiscal, contendo as informações da compra: tipo e
quantidade de carne, preço total, tipo de pagamento, valor do
desconto e valor a pagar.*/

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("==Tipos de Carne===");
		System.out.println("Filé Duplo[1] || Alcatra[2] || Picanha[3]");
		System.out.print("Opção: ");
		String tipoCarne = input.next();
		
		System.out.print("Quantidade (Kg): ");
		double qtdCarne = input.nextDouble();
		
		System.out.print("Vai pagar com Cartão [S/N]: ");
		String pagarCartao = input.next();
		
		System.out.println();
		
		double precoCarne = 0,
			   precoTotal = 0,
			   desconto = 0,
			   valorPagar = 0;
		
		if(pagarCartao.equalsIgnoreCase("S")) {
			
			if(tipoCarne.equalsIgnoreCase("1")  || tipoCarne.equalsIgnoreCase("Filé Duplo")) {
				
				if(qtdCarne <= 5) {
					precoCarne = 4.90;
					precoTotal = qtdCarne * precoCarne;
				} else {
					precoCarne = 5.80;
					precoTotal = qtdCarne * precoCarne;
				}
				
			} else if(tipoCarne.equalsIgnoreCase("2")  || tipoCarne.equalsIgnoreCase("Alcatra")) {
				
				if(qtdCarne <= 5) {
					precoCarne = 5.90;
					precoTotal = qtdCarne * precoCarne;
				} else {
					precoCarne = 6.80;
					precoTotal = qtdCarne * precoCarne;
				}
				
			} else if(tipoCarne.equalsIgnoreCase("3")  || tipoCarne.equalsIgnoreCase("Picanha")) {
				
				if(qtdCarne <= 5) {
					precoCarne = 6.90;
					precoTotal = qtdCarne * precoCarne;
				} else {
					precoCarne = 7.80;
					precoTotal = qtdCarne * precoCarne;
				}
				
			}
			
			desconto = (precoTotal * 5) / 100;
			valorPagar = precoTotal - desconto;
			
		} else {

			if(tipoCarne.equalsIgnoreCase("1")  || tipoCarne.equalsIgnoreCase("Filé Duplo")) {
				
				if(qtdCarne <= 5) {
					precoCarne = 4.90;
					precoTotal = qtdCarne * precoCarne;
				} else {
					precoCarne = 5.80;
					precoTotal = qtdCarne * precoCarne;
				}
				
			} else if(tipoCarne.equalsIgnoreCase("2")  || tipoCarne.equalsIgnoreCase("Alcatra")) {
				
				if(qtdCarne <= 5) {
					precoCarne = 5.90;
					precoTotal = qtdCarne * precoCarne;
				} else {
					precoCarne = 6.80;
					precoTotal = qtdCarne * precoCarne;
				}
				
			} else if(tipoCarne.equalsIgnoreCase("3")  || tipoCarne.equalsIgnoreCase("Picanha")) {
				
				if(qtdCarne <= 5) {
					precoCarne = 6.90;
					precoTotal = qtdCarne * precoCarne;
				} else {
					precoCarne = 7.80;
					precoTotal = qtdCarne * precoCarne;
				}
				
			}
			valorPagar = precoTotal;
		}
	
		System.out.println("Preco Total: $" + precoTotal);
		System.out.println("Desconto (5%): $" + desconto);
		System.out.println("Valor a Pagar: $" + valorPagar);
		
		input.close();
		
		
	}

}
