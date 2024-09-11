package exercicios1;//Arthur Perret e Guilherme Passold.

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n = sc.nextInt();

        System.out.printf("O número é: %d,\n seu antecessor é %d,\n e seu sucessor é %d.\n", n, (n - 1), (n + 1));

    }
}
