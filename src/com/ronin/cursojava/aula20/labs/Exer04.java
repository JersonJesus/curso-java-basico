package com.ronin.cursojava.aula20.labs;
/*4. Faça um programa para armazenar em uma matriz os
compromissos de uma agenda pessoal. Cada dia do mês deve
conter 24 horas, onde para cada uma destas 24 horas podemos
associar um tarefa específica (compromisso agendado). O
programa deve ter um menu onde o usuário indica o dia do mês
que deseja alterar e a hora, entrando em seguida com o
compromisso, ou então, o usuário pode também consultar a
agenda, fornecendo o dia e a hora para obter o
compromisso armazenado.*/

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[][] matrizComprimissos = new String[31][24];
		
		int opcao = 0,
			dia = 0,
			hora = 0;
		
		boolean sair = false,
				diaValido = false,
				horaValida = false;
		
		do {
			System.out.println("============MENU==============");
			System.out.println("[1] ===> ADICIONAR COMPRIMISSO");
			System.out.println("[2] ===> CONSULTAR COMPRIMISSO");
			System.out.println("[0] ===> SAIR");
			System.out.print("OPÇÃO: ");
			opcao = input.nextInt();
			
			if (opcao == 1) {
				
				do {
					System.out.print("Dia: ");
					dia = input.nextInt();
					
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("=====DADO INVÁLIDO=====");
					}
				} while (!diaValido);
				
				do {
					System.out.print("Hora: ");
					hora = input.nextInt();
					
					if(hora >= 0 && hora <= 23) {
						horaValida = true;
					} else {
						System.out.println("=====DADO INVÁLIDO=====");
					}
				} while (!horaValida);
				
				
				
				System.out.print("Compromisso: ");
				dia--;
				matrizComprimissos[dia][hora] = input.next();
				
				System.out.println("=====COMPRIMISSO ADICIONADO=====");
				
			} else if (opcao == 2) {
				
				do {
					System.out.print("Dia: ");
					dia = input.nextInt();
					
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("=====DADO INVÁLIDO=====");
					}
				} while (!diaValido);
				
				do {
					System.out.print("Hora: ");
					hora = input.nextInt();
					
					if(hora >= 0 && hora <= 23) {
						horaValida = true;
					} else {
						System.out.println("=====DADO INVÁLIDO=====");
					}
				} while (!horaValida);
				
				dia--;
				System.out.println("Compromisso: " + matrizComprimissos[dia][hora]);
			} else if (opcao == 0) {
				sair = true;
				System.out.println("=====SISTEMA ENCERRADO=====");
			} else {
				System.out.println("=====OPÇÃO INVÁLIDA=====");
			}
			
		} while (!sair);
		
		input.close();
		
	}

}
