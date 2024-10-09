package exercicios;
/*52) Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
a) Qual é a média de idade do grupo
b) Quantas pessoas tem mais de 18 anos
c) Quantas pessoas tem menos de 5 anos
d) Qual foi a maior idade lida*/
import java.util.Scanner;

public class Exer52 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int c = 0,
            idadeUsuario = 0,
            somaIdade = 0,
            idadeAcima18 = 0,
            idadeAcima5 = 0,
            maiorIdade = Integer.MIN_VALUE;
        
        while (c < 5) {            
            System.out.print("Idade da " + (c+1) + "ª pessoa: ");
            idadeUsuario = input.nextInt();
            
            somaIdade+=idadeUsuario;
            
            if (idadeUsuario > 18) {
                idadeAcima18++;
            } else if (idadeUsuario < 5) {
                idadeAcima5++;
            }
            
            if (idadeUsuario > maiorIdade) {
                maiorIdade = idadeUsuario;
            }
            c++;
        }
        System.out.println("Média de idade do grupo: " + (double)somaIdade / c);
        System.out.println("Pessoas que tem mais de 18 anos: " + idadeAcima18);
        System.out.println("Pessoas tem menos de 5 anos: " + idadeAcima5);
        System.out.println("Maior idade lida: " + maiorIdade);
        
        input.close();
    }
}
