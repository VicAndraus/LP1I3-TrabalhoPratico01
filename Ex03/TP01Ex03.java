import java.util.Scanner;

/**
 * Victória Andraus Canoilas Castro, Marcella Costa Tavares
 * 3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.
 */

public class TP01Ex03 {
    public static void main(String[] args) {        
        System.out.println("Digite a diagonal do quadrado: ");
	  Scanner input = new Scanner(System.in);
        double diagonal = input.nextDouble();
        
        double area = (diagonal * diagonal)/2;

        System.out.println("A área do quadrado é: " + area);
    }
}
