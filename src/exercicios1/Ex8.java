package exercicios1;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1,valor2,valor3,valor4;
        int[] valores = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o valor inteiro "+ (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        int maior = valores[0];
        int menor = valores[0];

        for (int i = 1; i < 4; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        System.out.println("O maior valor é " + maior + ".");
        System.out.println("O menor valor é " + menor + ".");

    }
}
