package exercicios;

/*34) O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
indivíduo dentro de certas faixas.
- abaixo de 18.5: Abaixo do peso
- entre 18.5 e 25: Peso ideal
- entre 25 e 30: Sobrepeso
- entre 30 e 40: Obesidade
- acima de 40: Obseidade mórbida
Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado
da altura)*/

import java.util.Scanner;

public class Exer34 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Peso (Kg): ");
        double pesoUsuario = input.nextDouble();
        
        System.out.println("Altura (m): ");
        double alturaUsuario = input.nextDouble();
        
        
        double imc = pesoUsuario / Math.pow(alturaUsuario, 2);
        System.out.printf("IMC: %.2f\n", imc);
        
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25){
            System.out.println("Peso Ideal");
        } else if (imc >= 25 && imc < 30){
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 40){
            System.out.println("Obesidade");
        } else {
            System.out.println("Obesidade Mórbida");
        }
                
    }
}
