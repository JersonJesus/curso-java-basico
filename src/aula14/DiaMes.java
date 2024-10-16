package aula14;

public class DiaMes {
    
    public static void main(String[] args) {
        
        String[] vetorMes = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int[] diaMes = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        for (int i = 0; i < vetorMes.length; i++) {
            System.out.println(vetorMes[i] + " tem " + diaMes[i] + " Dias");
        }
    }   
    
        
}
