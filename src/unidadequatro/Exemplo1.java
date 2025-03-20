package unidadequatro;

import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = teclado.nextInt();
        if (idade >= 18) {
            System.out.println("Adulto");
        } else if (idade >= 6) {  
                System.out.println("Adolescente");
            } else {
                System.out.println("infantil");
        }
    }
}

