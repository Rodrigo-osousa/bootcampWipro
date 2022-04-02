package java.atividadesDoDia01042022;

import java.util.Random;
import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {

        Random random = new Random();
        int aleatorio = random.nextInt(11);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Advinhe o valor em que eu estou pensando de 0 a 10:");
        int valor = entrada.nextInt();

        int tentativas = 0;

        while (aleatorio != valor) {
            tentativas++;
            if (aleatorio < valor) {
                System.out.println("Dica: O valor é menor que o aleatório " + "Tentativa de nº " + tentativas);
                valor = entrada.nextInt();
            } else {
                System.out.println("Dica: O valor é maior que o aleatório " + "Tentativa de nº " + tentativas);
                valor = entrada.nextInt();
            }
        }
        System.out.println("Acertou!!!");
        entrada.close();
    }
}
