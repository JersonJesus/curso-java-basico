package exercicios;
/*5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5*/
import java.util.Scanner;

public class Exer05 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in, "ISO-8859-1");
        
        double nota1,
               nota2,
               media;
        
        System.out.print("Nota 1: ");
        nota1 = input.nextDouble();
        
        System.out.print("Nota 2: ");
        nota2 = input.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        System.out.println("A média entre " + nota1 + " e " + nota2 + " é igual a " + media);
        
        input.close();
    }
}
