/*100) Melhore o exercício 96, criando além da função Media() uma outra função
chamada Situacao(), que vai retornar para o programa principal se o aluno está
APROVADO, em RECUPERAÇÃO ou REPROVADO. Essa nova função, vai receber como
parâmetro o resultado retornado pela função Media().*/
package exercicios;

import static exercicios.Exer96.media;
import java.util.Scanner;

/**
 *
 * @author Jerson Vndré
 */
public class Exer100 {

    public static double media(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;

        return media;
    }

    public static String situacao(double media) {
        String situacao;

        if (media < 5) {
            situacao = "REPROVADO";
        } else if (media >= 5 && media <= 7) {
            situacao = "RECUPERAÇÃO";
        } else {
            situacao = "APROVADO";
        }

        return situacao;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a 1ª nota: ");
        int nota1 = input.nextInt();

        System.out.print("Digite a 2ª nota: ");
        int nota2 = input.nextInt();

        double media = media(nota1, nota2);
        System.out.println("Média = " + media);
        
        String situacao = situacao(media);
        System.out.println("Situação: " + situacao);
    }
}
