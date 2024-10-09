package exercicios;
/*50) Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e
mostre na tela:
a) Quais foram os números sorteados
b) Quantos números estão acima de 5
c) Quantos números são divisíveis por 3*/
import java.util.Random;

public class Exer50 {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        int num,
            c = 1,
            numAcima5 = 0,
            numDiv3 = 0;
            
        System.out.print("Números Sorteados: ");
        while (c <= 20) {
            num = rand.nextInt(10) + 1;
            System.out.print(num + "...");
            
            if (num > 5) {
                numAcima5++;
            }
            
            if (num % 3 ==0) {
                numDiv3++;
            }
            c++;
        }
        System.out.println("\nNúmeros acima de 5: " + numAcima5);
        System.out.println("Números divisíveis por 3: " + numDiv3);
    }
}
