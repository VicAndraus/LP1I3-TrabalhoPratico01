import java.util.Scanner;

/**
 * Victória Andraus Canoilas Castro, Marcella Costa Tavares
 * 11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
 */

public class TP01Ex11 {
    public static void main(String[] args) {
        System.out.println("Digite o diâmetro do círculo: ");
	  Scanner input = new Scanner(System.in);
        double diametro = input.nextDouble();
        
        double area = Math.PI * (diametro/2) * (diametro/2);

        System.out.println("A área é: " + area);

    } 
}
