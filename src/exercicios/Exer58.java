package exercicios;

/*58) Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa
vai parar quando for digitada a idade 999. No final, mostre quantos alunos
existem na turma e qual é a média de idade do grupo.*/
import java.util.Scanner;

public class Exer58 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idadeAluno,
                c = 0;
        boolean encerrar = false;
        double soma = 0;

        while (!encerrar) {
            System.out.println("=====" + (c + 1) + "º Aluno=====");

            System.out.print("Idade: ");
            idadeAluno = input.nextInt();

            if (idadeAluno == 999) {
                encerrar = true;

            } else {
                soma+=idadeAluno;
                c++;
            }

            

        }
        System.out.println("Números de alunos na turma: " + c);
        System.out.println("Média de idade do grupo: " + soma/c);

    }
}
