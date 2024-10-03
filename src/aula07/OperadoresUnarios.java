
package aula07;

public class OperadoresUnarios {
    
    public static void main(String[] args) {
        
        //Pré Incremento
        int num1 = 5;
        int valor = 3 + ++num1;
        System.out.println(3 + " + " + "++" + 5 + " = " + valor);
        
        //Pré Decremento
        num1 = 5;
        valor = 3 + --num1;
        System.out.println(3 + " + " + "--" + 5 + " = " + valor);
        
        //Pós Incremento
        num1 = 5;
        valor = 3 + num1++;
        System.out.println(3 + " + " + 5 + "++ = " + valor);
        
        
        //Pré Decremento
        num1 = 5;
        valor = 3 + num1--;
        System.out.println(3 + " + " + 5 + "-- = " + valor);
        
    }
}
