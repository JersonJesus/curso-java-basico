package com.ronin.cursojava.aula17.labs;
/*3. Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';*/

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nome,
			   sexo,
			   estadoCivil;
		int idade;
		double salario;
		boolean dadoValido = false;
		
		
		
		do {
			System.out.print("Nome: ");
			nome = input.next();
			
			if (nome.length() >= 3) {
				dadoValido = true;
			} else {
				System.out.println("O Nome deve ter mais de 3 caracteres.");
			}
		} while (!dadoValido);
		
		dadoValido = false;
		
		do {
			System.out.print("Idade: ");
			idade = input.nextInt();
			
			if (idade >= 0 && idade <= 100) {
				dadoValido = true;
			} else {
				System.out.println("A Idade deve estar entre 0 e 100.");
			}
		} while (!dadoValido);
		
		dadoValido = false;
		
		do {
			System.out.print("Salário: ");
			salario = input.nextDouble();
			
			if (salario >= 0 ) {
				dadoValido = true;
			} else {
				System.out.println("O salário deve ser maior que 0.");
			}
		} while (!dadoValido);
		
		dadoValido = false;
		
		do {
			System.out.print("Sexo: ");
			sexo = input.next();
			
			if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F") ) {
				dadoValido = true;
			} else {
				System.out.println("O Sexo deve ser M ou F.");
			}
		} while (!dadoValido);
		
		dadoValido = false;
		
		do {
			System.out.print("Estado Civil: ");
			estadoCivil = input.next();
			
			if (estadoCivil.equalsIgnoreCase("C") || estadoCivil.equalsIgnoreCase("S") ||
				estadoCivil.equalsIgnoreCase("D") || estadoCivil.equalsIgnoreCase("V") ) {
				dadoValido = true;
			} else {
				System.out.println("O Estado Civil deve ser C,D,V,S");
			}
		} while (!dadoValido);
		
		System.out.println("=====CADASTRO DO USUÁRIO=====");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Salário: " + salario);
		System.out.println("Estado Civil: " + estadoCivil);
		
		
		input.close();
	}

}
