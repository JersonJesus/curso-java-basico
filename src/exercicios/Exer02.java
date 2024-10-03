package exercicios;
/*2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-
vindas para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!*/
import java.util.Scanner;

public class Exer02 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in, "ISO-8859-1");
        
        System.out.print("Digite o seu nome: ");
        String nomeUsuario = input.nextLine();
        
        System.out.println("Olá " + nomeUsuario + ", é um prazer te conhecer!");
        
        input.close();
        
    }
}
