package exercicios1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int idade;
        Scanner sc = new Scanner(System.in);

    System.out.print("Digite a sua idade: ");
    idade = sc.nextInt();


    if (idade >= 18 && idade <= 67) {
        System.out.println("Você pode doar sangue!");
    } else {
        System.out.println("Você não pode doar sangue.");
    }
}
}
