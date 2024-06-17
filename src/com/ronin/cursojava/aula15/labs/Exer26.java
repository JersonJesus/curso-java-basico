package com.ronin.cursojava.aula15.labs;
/*26. Um posto está vendendo combustíveis com a seguinte tabela de
descontos:
. Álcool:
a. até 20 litros, desconto de 3% por litro
b. acima de 20 litros, desconto de 5% por litro
Gasolina:
c. até 20 litros, desconto de 4% por litro
d. acima de 20 litros, desconto de 6% por litro Escreva um
algoritmo que leia o número de litros vendidos, o tipo de
combustível (codificado da seguinte forma: A-álcool, G-
gasolina), calcule e imprima o valor a ser pago pelo cliente
sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
do litro do álcool é R$ 1,90.*/
import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double precoGasolina = 2.50,
			   precoAlcool = 1.90;
		
		System.out.println("====TIPO DE COMBUSTÍVEL====");
		System.out.print("Gasolina - G || Álcool - A: ");
		String tipoCombustivel = input.nextLine();
		System.out.print("Quantidade (Litros): ");
		double qtdCombustivel = input.nextDouble();
		
		double totalPagar = 0,
			   desconto ;
		
		if(tipoCombustivel.equalsIgnoreCase("A") || tipoCombustivel.equalsIgnoreCase("Álcool")) {
			if(qtdCombustivel <= 20) {
				desconto = precoAlcool - ((precoAlcool * 3) / 100);
				totalPagar = qtdCombustivel * desconto;
			} else {
				desconto = precoAlcool - ((precoAlcool * 5) / 100);
				totalPagar = qtdCombustivel * desconto;
			}
		} else if (tipoCombustivel.equalsIgnoreCase("G") || tipoCombustivel.equalsIgnoreCase("Gasolina")) {
			if(qtdCombustivel <= 20) {
				desconto = precoGasolina - ((precoAlcool * 4) / 100);
				totalPagar = qtdCombustivel * desconto;
			} else {
				desconto = precoGasolina - ((precoAlcool * 6) / 100);
				totalPagar = qtdCombustivel * desconto;
			}
		}
		System.out.println("Teste");
		
		System.out.println("Total a Pagar: $" + totalPagar);
		input.close();

	}

}
