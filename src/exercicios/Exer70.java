package exercicios;
/*70) [DESAFIO] Faça um programa que mostre os 10 primeiros elementos da Sequência
de Fibonacci:
1 1 2 3 5 8 13 21...*/
public class Exer70 {
    
    public static void main(String[] args) {
        
        
        int a = 0,
            b = 1,
            c ;
        
        System.out.print("Fibonacci: ");
        for (int i = 0; i < 10; i++) {
            
            System.out.print(b + " ");
            c = a+b;
            a = b;
            b = c;
            
        }
    }
}
