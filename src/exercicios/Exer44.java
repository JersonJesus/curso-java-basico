package exercicios;

import java.util.Scanner;

/*44) Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
incremento, mostrando em seguida todos os valores no intervalo:
Ex: Digite o primeiro Valor: 3
Digite o último Valor: 10
Digite o incremento: 2
Contagem: 3 5 7 9 Acabou!*/
public class Exer44 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro Valor: ");
        int inicio = input.nextInt();
        
        System.out.print("Digite o último Valor: ");
        int fim = input.nextInt();
        
        System.out.print("Digite o incremento: ");
        int incremento = input.nextInt();
        
        
        while (inicio <= fim) {            
            System.out.print(inicio + " ");
            inicio += incremento;
        }
        
        System.out.println("Acabou!");
        
        input.close();
    }
}
