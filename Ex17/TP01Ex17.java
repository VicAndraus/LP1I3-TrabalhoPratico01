import java.util.Scanner;

/**
 * Victória Andraus Canoilas Castro, Marcella Costa Tavares
 * 17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
 */

public class TP01Ex17 {
	public static void main(String[] args) {
		System.out.println("Digite o primeiro número: ");
		Scanner input = new Scanner(System.in);
		double n1 = input.nextDouble();

		System.out.println("Digite o segundo número: ");
		double n2 = input.nextDouble();

		double R = Math.pow(n1, n2);

		System.out.println("O primeiro número elevado ao segundo é: " + R); 
	}
}