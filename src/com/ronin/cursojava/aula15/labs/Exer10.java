package com.ronin.cursojava.aula15.labs;
/*10. Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso.*/

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.println("Em que turno você estuda: ");
		String turno = input.next();
		
		if(turno.equalsIgnoreCase("M") || turno.equalsIgnoreCase("Matutino")) {
			
			System.out.println("BOM DIA!");
			
		} else if(turno.equalsIgnoreCase("V") || turno.equalsIgnoreCase("Vespertino")) {
			
			System.out.println("BOA TARDE!");
			
		} else if(turno.equalsIgnoreCase("N") || turno.equalsIgnoreCase("")) {
			
			System.out.println("BOA TARDE!");
		} else {
			System.out.println("Valor Inválido!");
		}
		
		input.close();	

	}

}
