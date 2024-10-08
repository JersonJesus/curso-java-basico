package exercicios;

/*28) Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
devemostrar a classificação desse terreno, de acordo com a lista abaixo:
- Abaixo de 100m² = TERRENO POPULAR
- Entre 100m² e 500m² = TERRENO MASTER
- Acima de 500m² = TERRENO VIP*/
import java.util.Scanner;

public class Exer28 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Largura m²: ");
        double largura = input.nextDouble();

        System.out.print("Comprimento m²: ");
        double comprimento = input.nextDouble();

        double area = largura * comprimento;
        System.out.printf("Área: %.2f m².\n", area);

        String descricao;

        if (area < 100) {
            descricao = "TERRENO POPULAR";
        } else if (area >= 100 && area <= 500) {
            descricao = "TERRENO MASTER";
        } else {
            descricao = "TERRENO VIP";
        }

        System.out.println("Descrição: " + descricao);

        input.close();
    }
}
