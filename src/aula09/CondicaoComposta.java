package aula09;

import java.util.Scanner;
import java.time.LocalDate;

public class CondicaoComposta {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int anoNascimento;
        
        System.out.print("Ano de Nascimento: ");
        anoNascimento = input.nextInt();
        
        int idade = LocalDate.now().getYear() -  anoNascimento;
        
        System.out.println("Idade: " + idade);
        
        if (idade >= 18) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }
    }
}
