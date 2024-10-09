package exercicios;

import java.util.Random;
import java.util.Scanner;

/*55) [DESAFIO] Vamos melhorar o jogo que fizemos no exercício 32. A partir de
agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4
tentativas para tentar acertar.*/
public class Exer55 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int numSorteado = rand.nextInt(5) + 1;
        System.out.println(numSorteado);
        
        boolean acertou = false;
        int numTentativas = 1;
        int num = 0,
            c = 4;
        
        while ((!acertou) && numTentativas <= 4) {   
            
            System.out.println("===== " + numTentativas + "ª Tentativa =====");
            System.out.print("Qual foi o número sorteado: ");
            num = input.nextInt();
            
            numTentativas++;
            
            if (num == numSorteado) {
                System.out.println("Você acertou, o número sorteado foi " + numSorteado);
                acertou = true;
            } else {
                c--;
                if (c >= 1) {
                    System.out.println("Você errou!\nFaltam " + c +  " tentativas.");
                } else {
                    System.out.println("Você errou!\nFIM DO JOGO");
                } 
            }     
        }
        input.close();
    }
}
