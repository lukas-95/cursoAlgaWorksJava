import java.util.Scanner;

/**
 * EstruturaDoWhile
 */
public class EstruturaDoWhile {

    public static void main(String[] args) {
        Scanner entrda = new Scanner(System.in);

        int valor = 0;
        int soma = 0;

        do {
            System.out.println("Digite 0 para sair ou qualquer número para somar: ");
            valor = entrda.nextInt();

            soma += valor;
            System.out.println("Soma: " + soma);
        } while (valor != 0);


    }
}