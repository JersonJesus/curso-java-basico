package com.ronin.cursojava.aula20.labs;
/*5. Modifique o programa anterior de maneira a guardar os
compromissos de todo o ano, organizados por mês, dia e hora
(só 8 horas por dia).*/

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][][] matrizComprimissos = new String[12][31][8];
		
		int opcao = 0,
				dia = 0,
				hora = 0,
				mes = 0;
			
			boolean sair = false,
					diaValido = false,
					horaValida = false,
					mesValido = false;
			
			do {
				System.out.println("============MENU==============");
				System.out.println("[1] ===> ADICIONAR COMPRIMISSO");
				System.out.println("[2] ===> CONSULTAR COMPRIMISSO");
				System.out.println("[0] ===> SAIR");
				System.out.print("OPÇÃO: ");
				opcao = input.nextInt();
				
				if (opcao == 1) {
					
					do {
						System.out.print("Mês: ");
						mes = input.nextInt();
						
						if(mes > 0 && mes <= 12) {
							mesValido = true;
						} else {
							System.out.println("=====DADO INVÁLIDO=====");
						}
					} while (!mesValido);
					
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
						
						if(hora >= 0 && hora <= 8) {
							horaValida = true;
						} else {
							System.out.println("=====DADO INVÁLIDO=====");
						}
					} while (!horaValida);
				
					System.out.print("Compromisso: ");
					dia--;
					mes--;
					
					matrizComprimissos[mes][dia][hora] = input.next();
					
					System.out.println("=====COMPRIMISSO ADICIONADO=====");
					
				} else if (opcao == 2) {
					
					do {
						System.out.print("Mês: ");
						mes = input.nextInt();
						
						if(mes > 0 && mes <= 12) {
							mesValido = true;
						} else {
							System.out.println("=====DADO INVÁLIDO=====");
						}
					} while (!mesValido);
					
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
						
						if(hora >= 0 && hora <= 8) {
							horaValida = true;
						} else {
							System.out.println("=====DADO INVÁLIDO=====");
						}
					} while (!horaValida);
					
					dia--;
					mes--;
					System.out.println("Compromisso: " + matrizComprimissos[mes][dia][hora]);
					
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
