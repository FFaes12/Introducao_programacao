package unidadecinco;

import java.util.Scanner;

public class Uni5Exe20 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a massa inicial em kg: ");
        double massaInicial = teclado.nextDouble();
        double massaAtual = massaInicial;

        int tempo = 0; 

        while (massaAtual >= 0.0005) {
            massaAtual = massaAtual / 2;
            tempo += 50;
        }

        System.out.printf("Massa inicial: %.4f kg\n", massaInicial);
        System.out.printf("Massa final: %.7f kg\n", massaAtual);
        System.out.printf("Tempo necessário: %d segundos\n", tempo);

        teclado.close();
    }
}

