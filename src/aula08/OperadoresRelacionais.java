package aula08;

public class OperadoresRelacionais {
    
    public static void main(String[] args) {
        
        int num1 = 6,
            num2 = 8;
        boolean resultado;
        
        resultado = 6 > 8;
        System.out.println(num1 + " > " + num2 + " = " + resultado);
        
        resultado = 6 < 8;
        System.out.println(num1 + " < " + num2 + " = " + resultado);
        
        resultado = 6 <= 8;
        System.out.println(num1 + " <= " + num2 + " = " + resultado);
        
        resultado = 6 >= 8;
        System.out.println(num1 + " >= " + num2 + " = " + resultado);
        
        resultado = 6 != 8;
        System.out.println(num1 + " != " + num2 + " = " + resultado);
        
        resultado = 6 == 8;
        System.out.println(num1 + " == " + num2 + " = " + resultado);
        
        //Todo operação feita com operadores relacionais resulta sempre em boolean
        
    }
   
}
