package unidadetres;
import java.util.Scanner;
public class Uni3Exe06 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       System.out.println("Informe o peso do seu prato total (em quilos)");
       double peso = teclado.nextDouble();
       double valortot = (peso - 0.750) * 25;
       System.out.printf("O valor do prato do cliente é R$%.2f%n ", valortot);
       teclado.close();
   }
}
