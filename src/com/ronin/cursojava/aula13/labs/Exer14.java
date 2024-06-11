package com.ronin.cursojava.aula13.labs;

import java.util.Scanner;

/*18. Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos).*/
public class Exer14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double tamanhoArquivo,
				velocidadeNet;
		
		System.out.println("Tamanho do Arquivo: ");
		tamanhoArquivo= input.nextDouble();
		
		System.out.println("Velocidade da Net:" );
		velocidadeNet = input.nextDouble();
		
		double tempoDownload = tamanhoArquivo / velocidadeNet;
		
		System.out.println("Tempo de Download: " + tempoDownload + "min.");
		

	}

}
