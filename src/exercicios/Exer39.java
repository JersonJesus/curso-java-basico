package exercicios;
/*39) Faça um algoritmo que mostre na tela a seguinte contagem:
10 9 8 7 6 5 4 3 Acabou!*/
public class Exer39 {
    
    public static void main(String[] args) {
        
        int c = 10;
        
        while (c >= 3) {            
            System.out.print(c + " ");
            c--;
        }
        System.out.println("Acabou!");
    }
}
