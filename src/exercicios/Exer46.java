package exercicios;
/*46) Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
8 + 10 + 12 + 14 + ... + 98 + 100.*/
public class Exer46 {
    
    public static void main(String[] args) {
        
        int c = 6,
            soma = 0;
        
        while (c <= 100) {            
            if (c != 100) {
                System.out.print(c + " + ");
            } else {
                System.out.print(c + " = ");
            }
            
            soma += c; 
            c += 2;
            
            
        }
        System.out.println(soma);
    }
}
