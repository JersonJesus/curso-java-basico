package exercicios;
/*61) Crie um programa que mostre na tela a seguinte contagem, usando a estrutura
?faça enquanto?
0 3 6 9 12 15 18 21 24 27 30 Acabou!*/
public class Exer61 {
    
    public static void main(String[] args) {
        
        int cont = 0;
        
        do {            
            System.out.print(cont + " ");
            cont+=3;
        } while (cont <= 30);
        System.out.println("Acabou!");
    }
}
