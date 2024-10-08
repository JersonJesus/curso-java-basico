package exercicios;

/*31) [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)*/
import java.util.Scanner;

public class Exer31 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Jogador 1: ");
        String jogador1 = input.next();

        System.out.print("Jogador 2: ");
        String jogador2 = input.next();

        String vencedor;

        if (jogador1.equalsIgnoreCase("PEDRA") && jogador2.equalsIgnoreCase("TESOURA")
                || jogador1.equalsIgnoreCase("PAPEL") && jogador2.equalsIgnoreCase("PEDRA")
                || jogador1.equalsIgnoreCase("TESOURA") && jogador2.equalsIgnoreCase("PAPEL")) {

            vencedor = "JOGADOR 1";

        } else {

            vencedor = "JOGADOR 2";

        }

        System.out.println("Vencedor: " + vencedor);

        input.close();
    }
}
