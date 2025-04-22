package unidadecinco;

import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Quantos numeros voce irá informar?");
        int n = teclado.nextInt();
        double valorMenor = Double.MAX_VALUE;
        double valorMaior = Double.MIN_VALUE;

        for(int contador = 1; contador <= n; contador++){
            System.out.println("Digite os numeros");
            double numeros = teclado.nextInt();
            if (numeros < valorMenor){
                valorMenor = numeros;
            }
            if (numeros > valorMaior){
                valorMaior = numeros;
            }
        }
        System.out.println("O menor numero dado é " + valorMenor);
        System.out.println("O maior numero dado é " + valorMaior);
        teclado.close();

    }
}
