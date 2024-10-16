package exercicios;
/*75) Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 15 posições com os primeiros
elementos da sequência de Fibonacci:*/
public class Exer75 {
    
    public static void main(String[] args) {
        
        int[] vetor = new int[15];
        
        vetor[0] = 1;
        vetor[1] = 1;
        
        for (int i = 2; i < vetor.length; i++) {
            vetor[i] = vetor[i - 1] + vetor[i - 2];
            
        }
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}
