package unidadecinco;

import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor máximo de pedágio que Astolfo aceita pagar: ");
        double valorMaximo = sc.nextDouble();

        int trechosNegados = 0;
        int totalTrechos = 0;
        int trechosAceitosAcima150Km = 0;

        while (true) {
            System.out.print("Informe o valor do pedágio (negativo para encerrar): ");
            double pedagio = sc.nextDouble();

            if (pedagio < 0) {
                break;
            }

            System.out.print("Informe a distância do trecho (em Km): ");
            int distancia = sc.nextInt();

            totalTrechos++;

            if (pedagio > valorMaximo) {
                trechosNegados++;
            } else if (distancia > 150) {
                trechosAceitosAcima150Km++;
            }
        }

        System.out.println();
        System.out.println(trechosNegados + " (trechos com valor acima do qual ele nega-se a pagar);");
        System.out.println(totalTrechos + " (quantidade de trechos informados);");
        System.out.println(trechosAceitosAcima150Km + " (trechos acima de 150km com valor aceito por ele).");

        sc.close();
    }
}