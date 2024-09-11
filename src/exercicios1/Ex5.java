package exercicios1;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

    String nome;
    int idade;
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o seu nome: ");
    nome = sc.nextLine();

    System.out.print("Digite a sua idade: ");
    idade = sc.nextInt();

    if (idade < 16) {
        System.out.printf("%s, você não pode votar!%n", nome);
    } else {
        System.out.printf("%s, você está apto(a) a votar!%n", nome);
    }
}
}
