package com.ronin.cursojava.aula15.labs;
/*16. Faça um programa que calcule as raízes de uma equação do segundo
grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
b e c e fazer as consistências, informando ao usuário nas seguintes
situações:
a. Se o usuário informar o valor de A igual a zero, a equação não é
do segundo grau e o programa não deve fazer pedir os demais
valores, sendo encerrado;
b. Se o delta calculado for negativo, a equação não possui raizes
reais. Informe ao usuário e encerre o programa;
c. Se o delta calculado for igual a zero a equação possui apenas
uma raiz real; informe-a ao usuário;
d. Se o delta for positivo, a equação possui duas raiz reais;
informe-as ao usuário;*/

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Valor A: ");
		double valorA = input.nextDouble();
		
		double x,
			   x1,
			   x2;
		
		if(valorA == 0) {
			System.out.println("A equação não é do 2º grau.");
		} else {
			System.out.print("Valor B: ");
			double valorB = input.nextDouble();
			
			System.out.print("Valor C: ");
			double valorC = input.nextDouble();
			
			double delta = Math.pow(valorB, 2) - (4 * valorA * valorC);
			
			if (delta > 0) {
				x1 = (-valorB + Math.sqrt(delta)) / 2 * valorA ;
				x2 = (-valorB - Math.sqrt(delta)) / 2 * valorA ;
				
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
				
			} else if (delta == 0){
				x= (-valorB + Math.sqrt(delta)) / 2 * valorA ;
				
				System.out.println("x = " + x);
				
			} else {
				System.out.println("A equação não possui raizes reais");
			}
		}
		
		
		input.close();

	}

}
