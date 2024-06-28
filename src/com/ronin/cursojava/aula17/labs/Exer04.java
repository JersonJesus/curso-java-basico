package com.ronin.cursojava.aula17.labs;



/*4. Supondo que a população de um país A seja da ordem de 80000
habitantes com uma taxa anual de crescimento de 3% e que a
população de B seja 200000 habitantes com uma taxa de crescimento
de 1.5%. Faça um programa que calcule e escreva o número de anos
necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento.*/


public class Exer04 {

	public static void main(String[] args) {
		
		int paisA = 80000,
			paisB = 200000;
		int anos = 0;
		
		while (paisA<=paisB) {
			paisA +=   ((paisA * 3) / 100);
			paisB +=   ((paisB * 1.5) / 100);
			
			anos++;
			
		}
		
		System.out.println("País A: " + paisA);
		System.out.println("País B: " + paisB);
		System.out.println("Serão necessário " + anos + " anos para o País A ultrapassar o País B.");
		
		

	}

}
