import java.util.Scanner;

/**
 * EstruturaFor
 */
public class EstruturaFor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ultimo numero: ");
        int numeroFinal = entrada.nextInt();
    

        for (int i = 1; i <= numeroFinal; i++) {
            System.out.println(i);
        }



    }
}