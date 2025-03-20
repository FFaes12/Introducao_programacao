package unidadequatro;

import java.util.Scanner;

public class Uni4Exe02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor inteiro maior que 0");
        int v = teclado.nextInt();
        if (v % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O numero é impar!");
        }
        teclado.close();
    }
}
