package exercicios;

/*37) Uma empresa precisa reajustar o salário dos seus funcionários, dando um
aumento de acordo com alguns fatores. Faça um programa que leia o salário atual,
o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa.
No final, mostre o seu novo salário, baseado na tabela a seguir:
- Mulheres
- menos de 15 anos de empresa: +5%
- de 15 até 20 anos de empresa: +12%
- mais de 20 anos de empresa: +23%
- Homens
- menos de 20 anos de empresa: +3%
- de 20 até 30 anos de empresa: +13%
- mais de 30 anos de empresa: +25%*/
import java.util.Scanner;

public class Exer37 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Salário: ");
        double salarioAtual = input.nextDouble();
        
        System.out.print("Gênero: ");
        char sexoUsuario = input.next().charAt(0);
        
        System.out.println("Anos de Trabalho: ");
        int anosTrabalho = input.nextInt();
        
        double novoSalario = 0;
        
        if (sexoUsuario == 'f' || sexoUsuario == 'F') {
            if (anosTrabalho < 15) {
                novoSalario = salarioAtual + (salarioAtual * 5) / 100;
            } else if (anosTrabalho >= 15 && anosTrabalho <= 20){
                novoSalario = salarioAtual + (salarioAtual * 12) / 100;
            } else {
                novoSalario = salarioAtual + (salarioAtual * 23) / 100;
            }    
        } else if (sexoUsuario == 'm' || sexoUsuario == 'M'){
             if (anosTrabalho < 20) {
                novoSalario = salarioAtual + (salarioAtual * 3) / 100;
            } else if (anosTrabalho >= 20 && anosTrabalho <= 30){
                novoSalario = salarioAtual + (salarioAtual * 13) / 100;
            } else {
                novoSalario = salarioAtual + (salarioAtual * 25) / 100;
            }
        }
        
        System.out.println("Novo Salário: " + novoSalario);
    }
}
