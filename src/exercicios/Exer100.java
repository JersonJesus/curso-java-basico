/*100) Melhore o exerc�cio 96, criando al�m da fun��o Media() uma outra fun��o
chamada Situacao(), que vai retornar para o programa principal se o aluno est�
APROVADO, em RECUPERA��O ou REPROVADO. Essa nova fun��o, vai receber como
par�metro o resultado retornado pela fun��o Media().*/
package exercicios;

import static exercicios.Exer96.media;
import java.util.Scanner;

/**
 *
 * @author Jerson Vndr�
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
            situacao = "RECUPERA��O";
        } else {
            situacao = "APROVADO";
        }

        return situacao;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a 1� nota: ");
        int nota1 = input.nextInt();

        System.out.print("Digite a 2� nota: ");
        int nota2 = input.nextInt();

        double media = media(nota1, nota2);
        System.out.println("M�dia = " + media);
        
        String situacao = situacao(media);
        System.out.println("Situa��o: " + situacao);
    }
}
