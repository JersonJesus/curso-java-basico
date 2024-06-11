package com.ronin.cursojava.aula15.labs;
/*12. Faça um programa para o cálculo de uma folha de pagamento,
sabendo que os descontos são do Imposto de Renda, que depende do
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
a empresa que deposita). O Salário Líquido corresponde ao Salário
Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
o Desconto do IR:
o Salário Bruto até 900 (inclusive) - isento
o Salário Bruto até 1500 (inclusive) - desconto de 5%
o Salário Bruto até 2500 (inclusive) - desconto de 10%
o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
as informações, dispostas conforme o exemplo abaixo. No
exemplo o valor da hora é 5 e a quantidade de hora é 220.
Salário Bruto: (5 * 220) : R$ 1100,00
(-) IR (5%) : R$ 55,00
(-) INSS ( 10%) : R$ 110,00
FGTS (11%) : R$ 121,00
Total de descontos : R$ 165,00
Salário Liquido : R$ 935,00*/
import java.util.Scanner;



public class Exer12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Valor por hora: ");
		double valorHora = input.nextDouble();
		
		System.out.print("Horas Trabalhadas: ");
		double horasTrabalhadas = input.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		
		int IR = 0;
		
		if (salarioBruto <= 900) {
			IR = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500){
			IR = 5;
		} else if (salarioBruto > 900 && salarioBruto <= 1500){
			IR = 10;
		} else {
			IR = 20;
		}		
		
		int INSS = 10;
		int FTGS = 11;
		
		double ir = (salarioBruto * IR)/100;
		double inss = (salarioBruto * INSS)/100;
		double ftgs = (salarioBruto * FTGS)/100;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println();
		System.out.println("Salário Bruto: " + salarioBruto + "$.");
		System.out.println("(-) IR : (" + IR + "%): " + ir + "$.");
		System.out.println("(-) INSS : (" + INSS + "%): " + inss + "$.");
		System.out.println("(-) FTGS : (" + FTGS + "%): " + ftgs + "$.");
		System.out.println("Total de Descontos: " + totalDescontos + "$.");
		System.out.println("Salário Líquido: " + salarioLiquido + "$.");
		
		input.close();

	}

}
