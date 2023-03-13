import java.util.Scanner;

/**
 * Victória Andraus Canoilas Castro, Marcella Costa Tavares
 * 5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado.
 */

public class TP01Ex05 {
    public static void main(String[] args) {     
        System.out.println("Digite o diâmetro da esfera: ");
        Scanner input = new Scanner(System.in);
        double diametro = input.nextDouble();
        
        double volume = 4/3 * Math.PI * (diametro/2);
        System.out.println("O volume é: " + volume);

    }
}
