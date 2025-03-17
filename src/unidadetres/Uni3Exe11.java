package unidadetres;
import java.util.Scanner;
public class Uni3Exe11 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       System.out.println("Insira o valor em graus que será convertido");
       float grau = teclado.nextFloat();
       double fahr = 1.8 * grau + 32;
       System.out.printf("%.2f%n", fahr);
       teclado.close();
    }
}

