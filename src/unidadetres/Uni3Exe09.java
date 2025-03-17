package unidadetres;
import java.util.Scanner;
public class Uni3Exe09 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      System.out.println("insira a medida do raio da lata");
      float r = teclado.nextFloat();
      System.out.println("insira a altura da lata");
      float a = teclado.nextFloat();
      double volume = 3.14159265358979 * Math.pow(r, 2) * a;
      System.out.printf("O volume da lata de óleo é: R$%.2f%n ",volume); 
      teclado.close();
   }
}
