package exercicios;
/*27) Crie um programa que leia duas notas de um aluno e calcule a sua média,
mostrando uma mensagem no final, de acordo com a média atingida:
- Média até 4.9: REPROVADO
- Média entre 5.0 e 6.9: RECUPERAÇÃO
- Média 7.0 ou superior: APROVADO*/
import java.util.Scanner;

public class Exer27 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("1ª Nota: ");
        double nota1 = input.nextDouble();
        
        System.out.print("2ª Nota: ");
        double nota2 = input.nextDouble();
        
        double mediaFinal = (nota1 + nota2) / 2;
        System.out.println("Média Final: " + mediaFinal);
        
        String situacao;
        
        if (mediaFinal <= 4.9 ) {
            situacao = "REPROVADO";
        } else if (mediaFinal >= 5 && mediaFinal <= 6.9){
            situacao = "RECUPERAÇÃO";
        } else {
            situacao = "APROVADO";
        }
        
        System.out.println("Situação: " + situacao);
        
        input.close();
    }
}
