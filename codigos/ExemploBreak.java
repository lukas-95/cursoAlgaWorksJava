import java.util.Scanner;

/**
 * ExemploBreak
 */
public class ExemploBreak {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int divisor = Integer.parseInt(entrada.next());

        for (int i = 100;  i <= 120; i++) {
            if (i % divisor == 0) {
                break;
            }
             System.out.println(i);
        }

        System.out.println("Fim do Programa");
    }
}