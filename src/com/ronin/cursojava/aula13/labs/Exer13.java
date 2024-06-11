package com.ronin.cursojava.aula13.labs;
/* Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela
abaixo:
Salário Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Salário
Liquido : R$*/
import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double valorHora;
		int horasTrabalhadas;
		
		System.out.print("Valor por Hora: " );
		valorHora = input.nextDouble();
		
		System.out.print("Horas Trabalhadas: ");
		horasTrabalhadas = input.nextInt();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		
		double IR =  (salarioBruto * 11) / 100;
		double INSS = (salarioBruto * 8) / 100;
		double sindicato =  (salarioBruto * 5) / 100;
		
		System.out.println("Salário Bruto: " + salarioBruto + "$.");
		System.out.println("Imposto de Renda (IR): " + IR + "$.");
		System.out.println("INSS: " + INSS + "$.");
		System.out.println("Sindicato: " + sindicato + "$.");
		
		double salarioLiquido = salarioBruto - IR - INSS - sindicato;
		
		System.out.println("Salário Líquido: " + salarioLiquido + "$.");
		
		input.close();
		
		
	}

}
