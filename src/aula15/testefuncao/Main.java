package aula15.testefuncao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Início: ");
        int ini = input.nextInt();

        System.out.print("Fim: ");
        int fim = input.nextInt();

        System.out.println(Operacoes.contador(ini, fim));

    }
}
