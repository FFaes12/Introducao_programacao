package unidadequatro;

import java.util.Scanner;

public class Uni4Exe12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o comprimento do lado 1:");
        int l1 = teclado.nextInt();
        System.out.println("Informe o comprimento do lado 2:");
        int l2 = teclado.nextInt();
        System.out.println("Informe o comprimento do lado 3:");
        int l3 = teclado.nextInt();

        if ((l1 <= l2 + l3) && (l2 <= l1 + l3) && (l3 <= l1 + l2)) {
            if (l1 == l2 && l1 == l3) {
                System.out.println("É equilátero");
            } else if (l1 == l2 || l2 == l3 || l1 == l3) {
                System.out.println("É isósceles");
            } else {
                System.out.println("É escaleno");
            }
        } else {
            System.out.println("Não forma um triângulo");
        }

        teclado.close();
    }
}
