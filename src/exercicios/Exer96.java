package exercicios;

import java.util.Scanner;

/*96) Crie um programa que tenha uma fun��o Media(), que vai receber as 2 notas de
um aluno e retornar a sua m�dia para o programa principal.*/
public class Exer96 {
    
    public static double media(double nota1, double nota2){
        double media = (nota1 + nota2) / 2;
        
        return media;
    } 
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a 1� nota: ");
        int nota1 = input.nextInt();
        
        System.out.print("Digite a 2� nota: ");
        int nota2 = input.nextInt();
        
        double media = media(nota1, nota2);
        
        System.out.println("M�dia = " + media);
        
        
    }
}
