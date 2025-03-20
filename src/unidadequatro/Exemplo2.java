package unidadequatro;

import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe sua idade");
        int idade = teclado.nextInt();

        if ((idade >= 18) && (idade < 60)) {
            System.out.println("Pagante");
        }
        System.out.println("..FIM..");
    }
}
