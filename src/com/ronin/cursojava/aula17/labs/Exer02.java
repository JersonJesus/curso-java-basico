package com.ronin.cursojava.aula17.labs;
/*2. Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.*/

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nomeUsuario,
			   senhaUsuario;
		
		boolean dadosValido = false;
		
		do {
			System.out.print("Nome do Usuario: ");
			nomeUsuario = input.nextLine();
			
			System.out.print("Senha do Usuário: ");
			senhaUsuario = input.nextLine();
			
			if (nomeUsuario.equalsIgnoreCase(senhaUsuario)) {
				System.out.println("Usuário e Senhas Iguais. Tente novamente!");
			} else {
				System.out.println("Acesso Liberado");
				dadosValido = true;
			}
		} while (!dadosValido);

		
		
		input.close();
		
	}

}
