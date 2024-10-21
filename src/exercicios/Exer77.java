package exercicios;

import java.util.Scanner;

/*77) Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No
final, mostre uma listagem com todos os nomes informados, na ordem inversa
daquela em que eles foram informados.*/
public class Exer77 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String[] vetorNomes = new String[7];
        
       
        for (int i = 0; i < vetorNomes.length; i++) {
            System.out.println("====" + (i+1) + "ª Pessoa====");
            System.out.print("Nome: ");
            vetorNomes[i] = input.nextLine();  
        }
        
        System.out.print("\nMostrando o vetor: ");
        for (int i = 0; i < vetorNomes.length; i++){
            System.out.print(i+":[" + vetorNomes[i] + "] ");
        }
        
        System.out.print("\nMostrando o vetor invertido: ");
        for (int i = vetorNomes.length - 1; i >= 0; i--){
            System.out.print(i+":[" + vetorNomes[i] + "] ");
        }
        
        
        
    }
}
