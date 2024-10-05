package exercicios;
/*19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
não um bom aproveitamento (se ficou acima da média 7.0).*/
import java.util.Scanner;

public class Exer19 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nome do Aluno: ");
        String nomeAluno = input.nextLine();
        
        System.out.print("1º Nota: ");
        double nota1 = input.nextDouble();
        
        System.out.print("2º Nota: ");
        double nota2 = input.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        System.out.println("Média:  " + media);
        
        if (media >= 7) {
            System.out.println("Situação: APTO");
        } else {
            System.out.println("Situação: NÃO APTO");
        }
        
        input.close();
        
    }
}
