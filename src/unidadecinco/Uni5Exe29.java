package unidadecinco;

import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor a ser sacado: ");
        int valor = sc.nextInt();

        int ced20 = 0, ced10 = 0, ced5 = 0, ced2 = 0, ced1 = 0;

        while (valor > 0) {
            if (valor >= 20) {
                ced20 = valor / 20;
                valor = valor % 20;
            } else if (valor >= 10) {
                ced10 = valor / 10;
                valor = valor % 10;
            } else if (valor >= 5) {
                ced5 = valor / 5;
                valor = valor % 5;
            } else if (valor >= 2) {
                ced2 = valor / 2;
                valor = valor % 2;
            } else {
                ced1 = valor;
                valor = 0;
            }
        }

        System.out.println("Cédulas necessárias:");
        if (ced20 > 0) System.out.println(ced20 + " de R$ 20");
        if (ced10 > 0) System.out.println(ced10 + " de R$ 10");
        if (ced5 > 0) System.out.println(ced5 + " de R$ 5");
        if (ced2 > 0) System.out.println(ced2 + " de R$ 2");
        if (ced1 > 0) System.out.println(ced1 + " de R$ 1");

        sc.close();
    }
}