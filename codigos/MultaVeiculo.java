import java.util.Scanner;

/**
 * MultaVeiculo
 */
public class MultaVeiculo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tipo do veículo (passeio, caminhao)");
        String tipoVeículo = entrada.nextLine();

        System.out.println("Velocidde maxima da via");
        int velocidadeMaxima = entrada.nextInt();

        System.out.println("Velocidde do veículo");
        int velocidadeVeiculo = entrada.nextInt();

        // veiculo de passeio com velocidade maior que 10% da velocidade da via
        // e caminhao com velocidade maior que 5% deve receber multa

        if ((tipoVeículo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1) 
                        || (tipoVeículo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05)){
                        System.out.println("Multa");
        }
    }
}