package unidadecinco;

import java.util.Scanner;


public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        for (int contador = 1; contador <= 20; contador++){
            System.out.println("Digite um numero: ");
            int numero = teclado.nextInt();

            if (numero % 2 == 0){
                System.out.println("Par");
            } else{
                System.out.println("Impar");
            }
        }
    }  
}
