package com.ronin.cursojava.aula17.labs;
/*40. Foi feita uma estatística em cinco cidades brasileiras para coletar
dados sobre acidentes de trânsito. Foram obtidos os seguintes dados:
. Código da cidade;
a. Número de veículos de passeio (em 1999);
b. Número de acidentes de trânsito com vítimas(em 1999).
Deseja-se saber:
c. Qual o maior e menor índice de acidentes de transito e a que
cidade pertence;
d. Qual a média de veículos nas cinco cidades juntas;
e. Qual a média de acidentes de trânsito nas cidades com menos
de 2.000 veículos de passeio.*/

import java.util.Scanner;

public class Exer40 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String nomeCidade;
		int numVeiculos,
			numAcidentes;
		
		String nomeCidadeMaior = " ";
		int maiorNumVeiculos,
			maiorNumAcidentes = Integer.MIN_VALUE;
		
		String nomeCidadeMenor = " ";
		int menorNumVeiculos,
			menorNumAcidentes  = Integer.MAX_VALUE;
		
		int somaVeiculos = 0,
			somaAcidentes = 0,
			numCidades = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("=====Cidade nº" + i + "=====");
			
			System.out.print("Nome da Cidade: ");
			nomeCidade = input.next();
			
			System.out.print("Números de Veículos: ");
			numVeiculos = input.nextInt();
			
			System.out.print("Números de Acidentes: ");
			numAcidentes = input.nextInt();
			
			System.out.println("==================");
			
			//VERIFICANDO O MAIS ALTO
			if(numAcidentes > maiorNumAcidentes) {
				  nomeCidadeMaior = nomeCidade;
				maiorNumAcidentes = numAcidentes;
			}
			
			//VERIFICANDO O MAIS ALTO
			if(numAcidentes < menorNumAcidentes) {
				nomeCidadeMenor = nomeCidade;
				menorNumAcidentes = numAcidentes;
			}
			
			if(numVeiculos < 2000) {
				numCidades += 1;
				somaAcidentes += numAcidentes;
			}
			somaVeiculos += numVeiculos;
		}
		
		double mediaVeiculos = somaVeiculos / 5,
			   mediaAcidentes = somaAcidentes / numCidades;
		
		
		System.out.println("\n====Maior Indíce de Acidentes====");
		System.out.println("Cidade: " + nomeCidadeMaior);
		System.out.println("Número de Acidentes: " + maiorNumAcidentes);
		
		System.out.println("\n====Menor Indíce de Acidentes====");
		System.out.println("Cidade: " + nomeCidadeMenor);
		System.out.println("Número de Acidentes: " + menorNumAcidentes);
		
		System.out.println("A média de veículos por cidade é de " + mediaVeiculos);
		System.out.println("A média de acidentes por cidade é de " + mediaAcidentes);
		
		
		input.close();

	}

}
