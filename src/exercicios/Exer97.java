package exercicios;

import java.util.Scanner;

/*97) Refaça o exercício 91, só que agora em forma de função Maior(), mas faça uma
adaptação que vai receber TRÊS números como parâmetro e vai retornar qual foi o
maior entre eles.*/
public class Exer97 {
    
    static int maior(int n1, int n2, int n3){
        int maior;
        
        if ((n1 > n2) && (n1 > n3)) {
            maior = n1;
        } else if((n2 > n1) && (n2 > n3)){
            maior = n2;
        } else {
            maior = n3;
        }
        
        return maior;
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o 1º número: ");
        int num1 = input.nextInt();
        
        System.out.print("Digite o 2º número: ");
        int num2 = input.nextInt();
        
        System.out.print("Digite o 3º número: ");
        int num3 = input.nextInt();
        
        int maiorValor = maior(num1, num2, num3);
        System.out.println("Maior Valor Digitado: " + maiorValor);
    }
}
