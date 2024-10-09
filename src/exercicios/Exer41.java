package exercicios;
/*41) Desenvolva um programa que mostre na tela a seguinte contagem:
100 95 90 85 80 ... 0 Acabou!*/
public class Exer41 {
    public static void main(String[] args) {
        
        int c = 100;
        
        while (c >= 0) {            
            System.out.print(c + " ");
            c -= 5;
        }
        System.out.println("Acabou!");
    }
}
