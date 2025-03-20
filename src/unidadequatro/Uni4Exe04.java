package unidadequatro;

import java.util.Scanner;

public class Uni4Exe04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor de ponto flutuante maior do que 0");
        float v = teclado.nextFloat();
        if (v % 1 == 0) {
            System.out.println("Casas decimais não foram digitadas");
        } else {
            System.out.println("Casas decimais foram digitadas");
        }
        teclado.close();
    }
}
