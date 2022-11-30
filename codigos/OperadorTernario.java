import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = entrada.nextInt ();
                                          //não colocar operador ternário dentro de operador ternário
        String indicacao = (idade >=24) ? "adulto" : (idade <= 12 ? "criança" : "adolescente");




        // Aqui com if, porém fica mais clean com operador ternário.
        /*if (idade >= 24) {
            indicacao = "adulto";
        } else {
            indicacao = "criança/adolescente";
        }*/

        System.out.println("Resultado: " + indicacao);

    
    }
}