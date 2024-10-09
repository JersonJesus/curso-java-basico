package exercicios;

import java.util.Scanner;

/*42) Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
qualquer e mostre uma contagem até esse valor:
Ex: Digite um valor: 35
Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!*/
public class Exer42 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Digite um valor: ");
        int num = input.nextInt();
        
        System.out.print("Contagem: ");
        
        int c = 1;
        
        while (c <= num) {            
            System.out.print(c + " ");
            c++;
        }
        
        input.close();
    }
}
