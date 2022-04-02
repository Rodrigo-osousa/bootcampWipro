package java.atividadesDoDia01042022;


import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String aluno = entrada.next();

        float primeiraNota, segundaNota, media;
        int i;

        for (i = 0; i <2; i++) {
            i++;
            System.out.print("Digite a primeira nota: ");
            primeiraNota = entrada.nextFloat();

            System.out.print("Digite a segunda nota: ");
            segundaNota = entrada.nextFloat();
            i++;
            media = (primeiraNota + segundaNota)/2;

            if (media >= 6) {
                System.out.println("Parabéns " + aluno + " sua média foi " + media);
            }else
                System.out.println("Estude um pouco mais sua média foi " + media);
        }
    }

}
