package unidadecinco;

import java.util.Scanner;

public class Uni5Exe08 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Quantos numeros voce irá digitar?");
    int n = teclado.nextInt();
    double somanumeros = 0;
    int quantidadepositivos = 0;
    double media = 0;
    double menorValor = Double.MAX_VALUE;
    for (int contador=1; contador <= n;contador++){
        System.out.println("Informe um numero");
        double numero = teclado.nextDouble();

        if (numero > 0){
            somanumeros += numero;
            quantidadepositivos++;
        }
        if (numero > 0){
            media = somanumeros / quantidadepositivos;
        }
        if (numero < 0){
            menorValor = numero;
        }
        
    }
    System.out.println("Media dos valores positivos = "+media);
    System.out.println("Menor valor negativo = "+menorValor);
  }
}
