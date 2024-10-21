package exercicios;
/*84) Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses
valores em dois vetores, em posições relacionadas. No final, mostre uma listagem
contendo apenas os dados das pessoas menores de idade.*/
import java.util.Scanner;

public class Exer84 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        String[] vetorNomes = new String[9];
        int[] vetorIdades = new int[9];
        
        for (int i = 0; i < vetorIdades.length; i++) {
            System.out.println("===" + (i+1) + "ª Pessoa===");
            System.out.print("Nome: ");
            vetorNomes[i] = input.next();
            System.out.print("Idade: ");
            vetorIdades[i] = input.nextInt();
            
        }
        System.out.println("");
        System.out.println("Lista das pessoas menores de idade:");
        for (int i = 0; i < vetorIdades.length; i++) {
            if (vetorIdades[i] < 18) {
                System.out.println(vetorNomes[i] + ": " + vetorIdades[i] + " anos.");
            }
            
            
        }
        
        
    }
}
