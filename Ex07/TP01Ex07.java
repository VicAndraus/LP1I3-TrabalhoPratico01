import java.util.Scanner;

/**
 * Victória Andraus Canoilas Castro, Marcella Costa Tavares
 * 7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.
 */

public class TP01Ex07 {
    public static void main(String[] args) {   
        System.out.println("Digite o primeiro número: ");
        Scanner input = new Scanner(System.in);
        double numero1 = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = input.nextDouble();
     
       double media = Math.sqrt(numero1 * numero2);
       
       System.out.println("A média geométrica é: " + media);

    }
}