package exercicios;

import java.util.Scanner;

/*67) Fa�a um programa usando a estrutura ?para? que leia um n�mero inteiro
positivo e mostre na tela uma contagem de 0 at� o valor digitado:
Ex: Digite um valor: 9
Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!*/
public class Exer67 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        int valor = input.nextInt();
        
        System.out.print("Contagem: ");
        for (int i = 0; i <= valor; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("FIM!");
        
        input.close();
    }
}
