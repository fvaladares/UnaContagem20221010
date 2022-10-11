import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static double pi() {
        return 3.14159265359;
    }

    private static void impressora(String impressao) {
        System.out.println(impressao);
    }

    private static int calcularDobro(int n) {
        int dobro = n * 2;
        return dobro;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Desafio d = new Desafio();
        d.quadrado();


        int numero;
        int retorno;
        System.out.println("Por favor, informe um número" +
                "para saber o dobro dele.");
        numero = entrada.nextInt();
        retorno = calcularDobro(numero);
        System.out.println("O dobro de " +
                numero + " é " +
                retorno);

        System.out.println(pi());
        System.out.println("A área do círculo de raio 5 é: "
                + pi() * Math.pow(5, 2));
        impressora("USANDO PROCEDIMENTO:: " +
                "A área do círculo de raio 5 é: "
                + pi() * Math.pow(5, 2));


//  Math -> biblioteca de funções matemáticas.
//        pow -> potenciação
//        srqt -> raiz quadrada
    }
}