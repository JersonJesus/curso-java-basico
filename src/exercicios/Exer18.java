package exercicios;

import java.time.LocalDate;
import java.util.Scanner;

/*18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
dela e depois mostre se ela pode ou não votar.*/
public class Exer18 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int idadeAtual, 
            anoAtual = LocalDate.now().getYear(),
            anoNascimento;
        
        System.out.print("Ano de Nascimento: ");
        anoNascimento = input.nextInt();
        
        idadeAtual = anoAtual - anoNascimento;
        System.out.println("Idade Atual: " + idadeAtual);
        
        if (idadeAtual > 18) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }
        
        input.close();
    }
}
