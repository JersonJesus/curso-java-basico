package aula06;

public class TiposPrimitivos {

    public static void main(String[] args) {
      
        //Declaração do tipo Normal
        int idadeUsuario = 3;
        double salarioUsuario = 1500.75;
        float velocidadeMaxima = 80.50f;
        char sexoUsuario = 'M';
        boolean ehCasado = true;
        
        //Declaração do tipo Typecast
        int numeroDaCasa = (int)31;
        double dinheiroEmCaixa = 25000.85;
        float pesoUsuario = 55.95f;
        char primeiraLetra = 'O';
        boolean saldoPositivo = (boolean)false;
        
        //Declaração usando Wrapper Classes;
        Integer numeroDeAmigos = new Integer(3);
        Double alturaUsuario = new Double(1.85);
        Float distanciaPercorrida = new Float(135.23f);
        Character letraInicial = new Character('Z');
        Boolean estahAberto = new Boolean(true);
        
        
    }
    
}
