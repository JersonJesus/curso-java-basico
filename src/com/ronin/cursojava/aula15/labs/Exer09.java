package com.ronin.cursojava.aula15.labs;
/*9. Faça um Programa que leia três números e mostre-os em ordem
decrescente.*/
import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o 1º valor: ");
		int num1 = input.nextInt();
		
		System.out.print("Digite o 2º valor: ");
		int num2 = input.nextInt();
		
		System.out.print("Digite o 3º valor: ");
		int num3 = input.nextInt();
		
		int maior,
			medio,
			menor;
	
	if (num1 > num2 && num1 > num3 && num2 > num3) {
		maior = num1;
		medio = num2;
		menor = num3;
	} else if (num1 > num2 && num1 > num3 && num3 > num2) {
		maior = num1;
		medio = num3;
		menor = num2;
	} else if (num2 > num1 && num2 > num3 && num1 > num3) {	
		maior = num2;
		medio = num1;
		menor = num3;
	} else if (num2 > num1 && num2 > num3 && num3 > num1) {	
		maior = num2;
		medio = num3;
		menor = num1;
	} else if (num3 > num1 && num3 > num2 && num1 > num2) {	
		maior = num3;
		medio = num1;
		menor = num2;
	} else {	
		maior = num3;
		medio = num2;
		menor = num1;
	}
		System.out.println("Números em ordem decrescente: " + maior + " " + medio + " " + menor);
		
		input.close();

	}

}
