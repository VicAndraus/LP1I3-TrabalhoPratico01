import java.util.Scanner;

/**
 * Victória Andraus Canoilas Castro, Marcella Costa Tavares
 * 15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).
 */

public class TP01Ex15 {
	public static void main(String[] args) {
		System.out.println("Digite a cotação do dolar: ");
		Scanner input = new Scanner(System.in);
		double Vdolar = input.nextDouble();

		System.out.println("Digite a quatidade de dolares: ");
		double Qdolar = input.nextDouble();

		double real = Vdolar * Qdolar;

		System.out.println("O valor em reais é de: " + real + " reais"); 
	}
}