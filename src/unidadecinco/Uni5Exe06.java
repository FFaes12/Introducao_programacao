package unidadecinco;

import java.util.Scanner;

public class Uni5Exe06 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       double somaaltura = 0;
       
       for (int contador = 1; contador <= 20; contador ++){
          System.out.println("Informe sua altura: ");
          double altura = teclado.nextDouble();
          somaaltura += altura;
        }
       double mediaaltura = somaaltura/20;
       System.out.println("A média das alturas é: " + mediaaltura);
       teclado.close();
   }
}
