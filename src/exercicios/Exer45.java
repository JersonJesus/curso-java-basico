package exercicios;
/*45) O programa acima vai ter um problema quando digitarmos o primeiro valor
maior que o último. Resolva esse problema com um código que funcione em qualquer
situação.*/

import java.util.Scanner;

public class Exer45 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro Valor: ");
        int inicio = input.nextInt();
        
        System.out.print("Digite o último Valor: ");
        int fim = input.nextInt();
        
        System.out.print("Digite o incremento: ");
        int incremento = input.nextInt();
        
        if (inicio < fim) {
            while (inicio <= fim) {            
                System.out.print(inicio + " ");
                inicio += incremento;
            }
        } else {
            while (inicio >= fim) {   
                System.out.print(fim + " ");
                fim += incremento;
            }
        }
        
        System.out.println("Acabou!");
        
        input.close();
    }
}
