package aula07;

public class ClassMath {
    
    public static void main(String[] args) {
        
        double num = 5;
        
        System.out.printf("PI = %.2f\n",Math.PI);
        System.out.println("5 elevado a 2 = " + Math.pow(num, 2));
        System.out.printf("Raiz Quadrada de 5 = %.2f\n", Math.sqrt(num));
        System.out.printf("Raiz Cúbica de 5 = %.2f\n",Math.cbrt(num));
        System.out.println("Maior valor entre 3 e 5 = " + Math.max(5, 3));
        System.out.println("Valor absoluto (-13) = " + Math.abs(-13));
        System.out.println("Arredondamento por Excesso (3.15) = " + Math.ceil(3.15));
        System.out.println("Arredondamento por Defeito (3.15) = " + Math.floor(3.15));
        System.out.println("Arredondamento Aritmeticamente (3.15) = " + Math.round(3.15));
        
        
        
        
    }
}
