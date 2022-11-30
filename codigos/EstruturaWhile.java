import java.util.Scanner;
import java.util.function.IntFunction;

/**
 * EstruturaWhile
 */
public class EstruturaWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite Numero Inicial: ");
        int numeroInicial = entrada.nextInt();

        System.out.println("Digite numero final: ");
        int numeroFinal = entrada.nextInt();

        int numeroAtual = numeroInicial;

        while (numeroAtual <= numeroFinal) {
            System.out.println(numeroAtual);
            numeroAtual++;
        }

    
    }
}