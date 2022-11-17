import java.util.Scanner;

import javax.xml.crypto.NoSuchMechanismException;

/**
 * Escopo
 */
public class Escopo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Idade: ");
        int idade = entrada.nextInt();

        boolean podeDirigir = idade >= 18;
        String nomePai = "";

        if (!podeDirigir) {
            System.out.println("Nome do pai: ");

            nomePai = entrada.next();
        }

        System.out.println("Você pode dirigir?");

        if (podeDirigir) {
            System.out.println("Sim, claro!!!");
        } else {
            System.out.println("Não, se fizer isso, seu pai " + nomePai + " será preso");
        }
    }
}