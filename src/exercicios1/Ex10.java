package exercicios1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int cigarroPDia;
        double preco;
        int anos;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Quantos anos voce fuma: ");
        anos = sc.nextInt();

        System.out.println("Qual o preço de uma carteira de cigarro: ");
        preco = sc.nextDouble();

        System.out.println("Quantos cigarros você fuma por dia: ");
        cigarroPDia = sc.nextInt();


        double totalCigarros = anos * 365 * cigarroPDia;
        double carteirasConsumidas = totalCigarros / 20.0;
        double gastoTotal = carteirasConsumidas * preco;
        System.out.println("Você gastou: "+gastoTotal);
    }
}
