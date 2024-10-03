package aula07;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        int num1 = 5,
            num2 = 2;
        
        int soma = num1 + num2;
        int subtração = num1 - num2;
        int multiplicacao = num1 * num2;
        double divisaoNormal = (double)num1 / num2;
        double restoDivisao = (double)num1 % num2;
        
        System.out.println("Soma => " + num1 + " + " + num2 + " = " + soma);
        System.out.println("Subtração => " + num1 + " - " + num2 + " = " + subtração);
        System.out.println("Multiplicação => " + num1 + " * " + num2 + " = " + multiplicacao);
        System.out.println("Divisão Normal => " + num1 + " / " + num2 + " = " + divisaoNormal);
        System.out.println("Resto da Divisão => " + num1 + " % " + num2 + " = " + restoDivisao);
    }
    
}
