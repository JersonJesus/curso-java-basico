package com.ronin.cursojava.aula17.labs;
/*30. O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende
implantar a metodologia da tabelinha, que já é um sucesso na sua loja
de 1,99. Você foi contratado para desenvolver o programa que monta
a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão
informado pelo usuário, conforme o exemplo abaixo:

Preço do pão: R$ 0.18

Panificadora Pão de Ontem - Tabela de preços

1 - R$ 0.18

2 - R$ 0.36

...
o
50 - R$ 9.00*/

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Preço do Pão: ");
		double precoPao = input.nextDouble();
		
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - $ " + precoPao * i);
		}
		
		input.close();

	}

}
