package exercicios;

import java.util.Scanner;

/*57) Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
No final, mostre o total de salários pagos aos homens e o total pago às
mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não
sempre que ler os dados de um funcionário.*/

public class Exer57 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double salarioFuncionario;
        
        char sexoFuncionario,
             respostaUsuario;
        
        int c = 1;
        
        boolean continuar = true;
        
        double totalSalarioHomens = 0,
               totalSalarioMulheres = 0;
        
        while (continuar) {            
            System.out.println("=====" + c + "º Funcionário=====");
            
            System.out.print("Salário: ");
            salarioFuncionario = input.nextDouble();
            
            System.out.print("Sexo [M/F]: ");
            sexoFuncionario = input.next().charAt(0);
            
            System.out.print("Deseja cadastrar outro funcionário? [S/N]: ");
            respostaUsuario = input.next().charAt(0);
            
            if (respostaUsuario == 'n' || respostaUsuario == 'N') {
                continuar = false;
            }
            
            if (sexoFuncionario == 'M' || sexoFuncionario == 'm') {
                totalSalarioHomens+=salarioFuncionario;
            } else if (sexoFuncionario == 'F' || sexoFuncionario == 'f'){
                totalSalarioMulheres+=salarioFuncionario;
            }
            
            c++;
        }
        
        System.out.println("Total de salários pagos aos homens: " + totalSalarioHomens);
        System.out.println("Total de salários pagos as mulheres: " + totalSalarioMulheres);
        
    }
}
