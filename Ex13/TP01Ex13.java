import java.util.Scanner;

/**
 * Victória Andraus Canoilas Castro, Marcella Costa Tavares
 * 13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
(em s) que serão digitados.
 */

public class TP01Ex13 {
    public static void main(String[] args) {
        System.out.println("Digite a velocidade inicial: ");
	  Scanner input = new Scanner(System.in);
        double v0 = input.nextDouble();
        
        System.out.println("Digite a aceleração: ");
        double a = input.nextDouble();
        
        System.out.println("Digite o tempo de viagem: ");
        double t = input.nextDouble();
        
        double vf = ((v0 + (a*t))* 3.6);
        
        System.out.println("A Velocidade final é: " + vf);      
    } 
}