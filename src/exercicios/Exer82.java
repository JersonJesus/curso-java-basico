package exercicios;

import java.util.Scanner;

/*82) Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em
um vetor. No final, mostre:
a) Qual é a média da turma
b) Quantos alunos estão acima da média da turma
c) Qual foi a maior nota digitada
d) Em que posições a maior nota aparece*/
public class Exer82 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] vetor = new double[8];
        double somaNotas = 0;

        System.out.println("Atribuindo notas ao vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("===" + (i + 1) + "º Aluno===");
            System.out.print("Nota: ");
            vetor[i] = input.nextDouble();

            somaNotas += vetor[i];
        }

        System.out.println("Gerando o vetor de notas: ");
        for (double d : vetor) {
            System.out.print("[" + d + "] ");
        }

        int alunosMediaAcima = 0;

        double mediaTurma = somaNotas / vetor.length;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > mediaTurma) {
                alunosMediaAcima++;
            }

        }
        double maiorNota = Double.MIN_VALUE;
        System.out.println("");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorNota) {
                maiorNota = vetor[i];
            }
        }

        int pos = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == maiorNota) {
                pos = i;
            }

        }
        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Alunos acima da média da turma: " + alunosMediaAcima);
        System.out.println("Maior Nota Digitada: " + maiorNota);
        System.out.println("Maior nota aparece na posição: " + pos);
    }
}
