package exercicios;

/*81) Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No
final, mostre:
a) Qual é a média de idade das pessoas cadastradas
b) Em quais posições temos pessoas com mais de 25 anos
c) Qual foi a maior idade digitada (podem haver repetições)
d) Em que posições digitamos a maior idade*/
import java.util.Random;

public class Exer81 {

    public static void main(String[] args) {

        Random rand = new Random();

        int[] vetor = new int[8];

        int somaIdades = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int pos = 0;

        System.out.println("Gerando o vetor com as idades:");
        for (int i = 0; i < vetor.length; i++) {

            vetor[i] = rand.nextInt(50) + 1;
            System.out.print(i + ":[" + vetor[i] + "] ");

            somaIdades += vetor[i];
        }

        System.out.println("");

        System.out.println("Média de idade das pessoas cadastradas: " + (double) somaIdades / vetor.length + " anos.");

        System.out.println("Temos pessoas com mais de 25 anos nas posições: ");
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] > 25) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] > maiorIdade) {
                maiorIdade = vetor[i];
            }
        }
        System.out.println("Maior idade digitada: " + maiorIdade);
 
        System.out.println("Maior digitada nas posições: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == maiorIdade) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

}
