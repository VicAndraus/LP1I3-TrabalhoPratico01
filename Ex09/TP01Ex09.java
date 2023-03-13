import java.util.Scanner;

/**
 * Victória Andraus Canoilas Castro, Marcella Costa Tavares
 * 9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
 */

public class TP01Ex09 {
	public static void main(String[] args) {
		System.out.println("Digite a resistência: ");
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();

		System.out.println("Digite a corrente elétrica: ");
		double i = input.nextDouble();

		double V = r * i;

		System.out.println("A tensão é de: " + V); 
	}
}
