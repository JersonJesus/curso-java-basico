package exercicios;

/*53) Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
a) Quantos homens foram cadastrados
b) Quantas mulheres foram cadastradas
c) A média de idade do grupo
d) A média de idade dos homens
e) Quantas mulheres tem mais de 20 anos*/
import java.util.Scanner;

public class Exer53 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int c = 0,
            idadeUsuario = 0;

        char sexoUsuario;

        int homensCadastrados = 0,
                mulheresCadastradas = 0,
                soma = 0,
                somaIdadeHomens = 0,
                mulherAcima20 = 0;

        while (c < 5) {
            System.out.println("=====" + (c + 1) + "ª Pessoa =====");
            System.out.print("Idade: ");
            idadeUsuario = input.nextInt();

            soma += idadeUsuario;

            System.out.print("Sexo [M/F]: ");
            sexoUsuario = input.next().charAt(0);

            if (sexoUsuario == 'M' || sexoUsuario == 'm') {
                homensCadastrados++;
                somaIdadeHomens += idadeUsuario;
            } else if (sexoUsuario == 'F' || sexoUsuario == 'f') {
                mulheresCadastradas++;
                if (idadeUsuario > 20) {
                    mulherAcima20++;
                }
            }

            c++;
        }
        System.out.println("========== RESULTADO ==========");
        System.out.println("Homens cadastrados: " + homensCadastrados);
        System.out.println("Mulheres cadastradas: " + mulheresCadastradas);
        System.out.println("Média de idade do grupo: " + (double) soma / c);
        System.out.println("A média de idade dos homens: " + (double) somaIdadeHomens / homensCadastrados);
        System.out.println("Mulheres que tem mais de 20 anos: " + mulherAcima20);

        input.close();
    }
}
