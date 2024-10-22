package aula15;

import java.util.Scanner;

public class MetodoComParametroERetorno {

    //Método
    static int soma(int num1, int num2) {
        int soma = num1 + num2;

        return soma;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("1º Valor: ");
        int num1 = input.nextInt();

        System.out.print("2º Valor: ");
        int num2 = input.nextInt();

        int resultado;

        resultado = soma(num1, num2);

        System.out.println(num1 + " + " + num2 + " = " + resultado);
    }
}
