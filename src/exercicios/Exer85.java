package exercicios;

import java.util.Scanner;

/*85) Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários e
guarde esses dados em três vetores. No final, mostre uma listagem contendo
apenas os dados das funcionárias mulheres que ganham mais de R$5 mil.*/
public class Exer85 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] vetorNomes = new String[5];
        String[] vetorSexo = new String[5];
        double[] vetorSalarios = new double[5];

        for (int i = 0; i < vetorSalarios.length; i++) {
            System.out.println("===" + (i + 1) + "ª Pessoa===");

            System.out.print("Nome: ");
            vetorNomes[i] = input.next();

            System.out.print("Sexo: ");
            vetorSexo[i] = input.next();

            System.out.print("Salário: ");
            vetorSalarios[i] = input.nextInt();

        }
        System.out.println("");
        
       
        
        for (int i = 0; i < vetorSalarios.length; i++) {
            if (vetorSexo[i].equalsIgnoreCase("F") && vetorSalarios[i] >= 5000) {
                System.out.println("Nome: " + vetorNomes[i] + ": " + vetorSalarios[i] + "$");
            }
            
        }
                
    }
}
