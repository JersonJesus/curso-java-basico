package aula06;

import java.util.Scanner;

public class EntradaDeDados { 
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        String nomeUsuario = input.next();
        
        System.out.print("Digite a sua idade: ");
        int idadeUsuario = input.nextInt();
        
        System.out.println("Seu nome é " + nomeUsuario);
        System.out.println("Sua idade é " + idadeUsuario + " anos.");
    }
}
