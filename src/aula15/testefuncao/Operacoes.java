package aula15.testefuncao;

public class Operacoes {

    public static String contador(int inicio, int fim) {
        String s = " ";

        for (int i = inicio; i <= fim; i++) {
            s += i + " ";
        }

        return s;

    }
}
