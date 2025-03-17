package unidadetres;
import java.util.Scanner;
public class Uni3Exe05 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);                       //cada frango é 11, 4 +3
       System.out.println("informe a quantidade de frangos");
       int frangos = teclado.nextInt();
       int valortotal = 11 * frangos;
       System.out.println("O gasto total para marcar "+ frangos + "é R$"+valortotal);
       teclado.close();
   }
}
