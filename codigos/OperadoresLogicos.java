import java.util.Scanner;
/**
 * OperadoresLogicos
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu peso: ");
        int peso = entrada.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Sexo (1 para 'M'ou outro numero para 'F'): ");
        char sexo = entrada.nextShort() == 1 ? 'M' : 'F';

        double imc = peso / (altura * altura);



        if ((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 20.7)) {
            System.out.print("Abaixo do peso");
        }else if ((sexo == 'F' && imc <= 25.8) || (sexo == 'M' && imc <26.4)){
            System.out.print("Peso ideal");
        } else if  ((sexo =='F'&& imc <=27.3) || (sexo == 'M'&& imc  <27.8)){
            System.out.print("Um pouco acima do peso");
        }
    }
}