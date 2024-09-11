package exercicios1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        String sexo;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        sexo = sc.nextLine().toUpperCase();

        if (sexo.equals("M")) {
            System.out.println("Sexo: Masculino");
        } else if (sexo.equals("F")) {
            System.out.println("Sexo: Feminino");
        } else {
            System.out.println("Entrada inválida. Digite 'M' para masculino ou 'F' para feminino.");
        }


    }
}