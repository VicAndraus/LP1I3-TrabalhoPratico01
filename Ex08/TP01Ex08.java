import java.util.Scanner;

/**
 * Victória Andraus Canoilas Castro, Marcella Costa Tavares
 * 8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.
 */

public class TP01Ex08 {
    public static void main(String[] args){
        System.out.println("Digite um valor em milhas: ");
        Scanner input = new Scanner(System.in);
        double milhas = input.nextDouble();
	

        double conversao = milhas * 1.852;
        
        System.out.println("A conversão de milhas para km é de: " + conversao + "km");
        
    }
}