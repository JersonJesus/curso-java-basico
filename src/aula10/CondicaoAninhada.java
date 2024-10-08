package aula10;

import java.time.LocalDate;
import java.util.Scanner;

public class CondicaoAninhada {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int anoNascimento,
            anoAtual = LocalDate.now().getYear(),
            idade;
        
        System.out.print("Ano de Nascimento: ");
        anoNascimento = input.nextInt();
        
        idade = anoAtual - anoNascimento;
        System.out.println("Idade: " + idade);
        
        if (idade < 16) {
            System.out.println("Não Vota");
        } else if ((idade >= 16 && idade < 18) || (idade > 70)){
            System.out.println("Voto Não Obrigatorio");
        } else {
            System.out.println("Voto Obrigatório");
        }
        
    }
}
