package exercicios1;

import java.util.Scanner;

    public class Ex2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Digite a distância percorrida (em km): ");
            int distancia = scanner.nextInt();


            System.out.print("Digite o total de combustível gasto (em litros): ");
            double combustivel = scanner.nextDouble();


            double mediaConsumo = distancia / combustivel;


            System.out.printf("A média de consumo do veículo é: %.2f km/l\n", mediaConsumo);
        }
    }

