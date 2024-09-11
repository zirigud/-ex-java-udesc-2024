package exercicios1;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a Nota " +(i + 1) + "*: ");
                notas[i] = sc.nextDouble();
                System.out.println("Erro, Digite novamente: ");
        }

        double media = (notas[0] + notas[1] + notas[2]) / 3;

        if (media >= 7) {
            System.out.println("Aprovado com média: "+media);
        } else if (media >= 5) {
            System.out.println("Em Exame com média: "+media);
        }else{
            System.out.println("Reprovado com média: "+media);
        }

    }
}
