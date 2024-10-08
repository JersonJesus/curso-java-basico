package exercicios;

/*32) [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
! jogador vai tentar descobrir qual foi o valor sorteado.*/
import java.util.Random;
import java.util.Scanner;

public class Exer32 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int numSorteado = rand.nextInt(5) + 1;

        System.out.print("Qual foi o número sorteado: ");
        int num = input.nextInt();

        if (num == numSorteado) {
            System.out.println("Você acertou, o número sorteado foi " + numSorteado);
        } else {
            System.out.println("Você errou, o número sorteado foi " + numSorteado);
        }

        input.close();

    }
}
