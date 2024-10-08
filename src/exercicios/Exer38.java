package exercicios;

/*38) Escreva um programa que mostre na tela a seguinte contagem:
6 7 8 9 10 11 Acabou!*/
public class Exer38 {

    public static void main(String[] args) {

        int c = 6;

        while (c <= 11) {
            System.out.print(c + " ");
            c++;
        }
        System.out.println("Acabou!");
    }
}
