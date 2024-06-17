package com.ronin.cursojava.aula15.labs;
/*25. Faça um programa que faça 5 perguntas para uma pessoa sobre um
crime. As perguntas são:
. "Telefonou para a vítima?"
a. "Esteve no local do crime?"
b. "Mora perto da vítima?"
c. "Devia para a vítima?"
d. "Já trabalhou com a vítima?" O programa deve no final emitir
uma classificação sobre a participação da pessoa no crime. Se
a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
como "Assassino". Caso contrário, ele será classificado como
"Inocente".*/

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String resposta ;
		int pontos = 0;
		
		System.out.println("=====RESPONDA SIM OU NÃO AS SEGUINTES PERGUNTAS=====\n");
		
		System.out.println("Telefonou para a vítima?");
		System.out.print("Resposta: ");
		resposta = input.nextLine();

		if(resposta.equalsIgnoreCase("SIM") || resposta.equalsIgnoreCase("S")) {
			pontos++;
		}
		
		System.out.println("Esteve no local do crime?");
		System.out.print("Resposta: ");
		resposta = input.nextLine();
		
		if(resposta.equalsIgnoreCase("SIM") || resposta.equalsIgnoreCase("S")) {
			pontos++;
		}
		
		System.out.println("Mora perto da vítima");
		System.out.print("Resposta: ");
		resposta = input.nextLine();
		
		if(resposta.equalsIgnoreCase("SIM") || resposta.equalsIgnoreCase("S")) {
			pontos++;
		}
		
		System.out.println("Devia para a vítima?");
		System.out.print("Resposta: ");
		resposta = input.nextLine();
		
		if(resposta.equalsIgnoreCase("SIM") || resposta.equalsIgnoreCase("S")) {
			pontos++;
		}
		
		System.out.println("Já trabalhou com a vítima?");
		System.out.print("Resposta: ");
		resposta = input.nextLine();
		
		if(resposta.equalsIgnoreCase("SIM") || resposta.equalsIgnoreCase("S")) {
			pontos++;
		}
		
		
		
		if(pontos == 2) {
			System.out.println("Classificação: SUSPEITO");
		} else if (pontos >= 3 && pontos <= 4) {
			System.out.println("Classificação: CUMPLÍCE");
		} else if (pontos == 5) {
			System.out.println("Classificação: ASSASINO");
		} else {
			System.out.println("Classificação: INOCENTE");
		}
			
		
		input.close();

	}

}
