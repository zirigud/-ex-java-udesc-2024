package exercicios1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        double horas;
        double valor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora: ");
        horas = sc.nextDouble();

        System.out.println("Digite Quantas horas Trabalhou esse mês: ");
        valor = sc.nextDouble();

        double calculo = horas * valor;

        System.out.printf("O total de horas trabalhadas é: %.2f" +
                " O valor da sua hora é: %.2f" +
                " E o total é %.2f",horas,valor,calculo);


    }
}
