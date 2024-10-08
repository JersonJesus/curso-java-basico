package exercicios;

/*30) [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
de triângulo será formado:
- EQUILÁTERO: todos os lados iguais
- ISÓSCELES: dois lados iguais
- ESCALENO: todos os lados diferentes*/
import java.util.Scanner;

public class Exer30 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lado A: ");
        double ladoA = input.nextDouble();

        System.out.print("Lado B: ");
        double ladoB = input.nextDouble();

        System.out.print("Lado C: ");
        double ladoC = input.nextDouble();

        if ((ladoA < ladoB + ladoC)
                && (ladoB < ladoA + ladoC)
                && (ladoC < ladoA + ladoB)) {
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("TRIÂNGULO EQUILÁTERO");
            } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
                System.out.println("TRIÂNGULO ISÓCELES");
            } else if (ladoA != ladoB && ladoB != ladoC && ladoC != ladoA) {
                System.out.println("TRIÂNGULO ESCALENO");
            }
        } else {
            System.out.println("NÃO É UM TRIÂNGULO");
        }

        input.close();

    }
}
