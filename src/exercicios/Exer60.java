package exercicios;

/*60) Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas.
O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
a) O nome da pessoa mais velha
b) O nome da mulher mais jovem
c) A média de idade do grupo
d) Quantos homens tem mais de 30 anos
e) Quantas mulheres tem menos de 18 anos*/
import java.util.Scanner;

public class Exer60 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char sexoUsuario,
                respostaUsuario;

        String nomeUsuario;

        int idadeUsuario,
            c = 0,
            somaIdadeUsuarios = 0,
            homensAcima30 = 0,
            mulheresAbaixo18 = 0;

        boolean continuar = true;

        String nomePessoaMaisVelha = " ",
                    nomeMulherMaisJovem = " ";

        int idadePessoaMaisVelha = Integer.MIN_VALUE,
                idadeMulherMaisJovem = Integer.MAX_VALUE;

        while (continuar) {
            System.out.println("=====" + (c + 1) + "º Pessoa=====");

            System.out.print("Nome: ");
            nomeUsuario = input.next();

            System.out.print("Sexo: ");
            sexoUsuario = input.next().charAt(0);

            System.out.print("Idade: ");
            idadeUsuario = input.nextInt();

            somaIdadeUsuarios += idadeUsuario;

            //Calcular a idade da pessoa mais velha
            if (idadeUsuario > idadePessoaMaisVelha) {
                idadePessoaMaisVelha = idadeUsuario;
                nomePessoaMaisVelha = nomeUsuario;
            }

            if (sexoUsuario == 'M' || sexoUsuario == 'm') {
                if (idadeUsuario > 30) {
                    homensAcima30++;
                }

            } else if (sexoUsuario == 'F' || sexoUsuario == 'f') {
                if (idadeUsuario < 18) {
                    mulheresAbaixo18++;
                }
                if (idadeUsuario < idadeMulherMaisJovem) {
                    idadeMulherMaisJovem = idadeUsuario;
                    nomeMulherMaisJovem = nomeUsuario;
                }
            }

            System.out.print("Deseja cadastrar outra pessoa? [S/N]: ");
            respostaUsuario = input.next().charAt(0);

            if (respostaUsuario == 'n' || respostaUsuario == 'N') {
                continuar = false;
            }
            c++;
        }
        System.out.println("Nome da pessoa mais velha: " + nomePessoaMaisVelha);
        System.out.println("Nome da mulher mais jovem: " + nomeMulherMaisJovem);
        System.out.println("Média de idade do grupo: " + (double) somaIdadeUsuarios / c);
        System.out.println("Homens que tem mais de 30 anos: " + homensAcima30);
        System.out.println("Mulheres que tem menos de 18 anos : " + mulheresAbaixo18);
        
        input.close();

    }
}
