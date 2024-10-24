/*98) Crie um programa que tenha uma função SuperSomador(), que vai receber dois
números como parâmetro e depois vai retornar a soma de todos os valores no
intervalo entre os valores recebidos.
Ex:
SuperSomador(1, 6) vai somar 1 + 2 + 3 + 4 + 5 + 6 e vai retornar 21
SuperSomador(15, 19) vai somar 15 + 16 + 17 + 18 + 19 e vai retornar 85*/
package exercicios;

import java.util.Scanner;

public class Exer98 {
    
    public static int superSomador(int n1, int n2){
        int res = 0;
        
        for (int i = n1; i <=n2; i++) {
            res+=i;
            
            if (i < n2) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i + " = ");
            }            
        }
        return res;    
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o 1º número: ");
        int num1 = input.nextInt();
        
        System.out.print("Digite o 2º número: ");
        int num2 = input.nextInt();
        
        int resultado = superSomador(num1, num2);
        System.out.println(resultado);
    }
}
