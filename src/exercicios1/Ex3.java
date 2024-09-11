package exercicios1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        double n1;
        double n2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n1 = sc.nextDouble();

        System.out.println("Digite outro número: ");
        n2 = sc.nextDouble();

        if (n1>n2)
        {
            System.out.printf("%,2f é o número maior: ",n1);
        }
        else if (n2>n1)
        {
            System.out.printf("%.2f é o número maior: ",n2);
        }
        else {
            System.out.println("São iguais");
        }
    }
}
