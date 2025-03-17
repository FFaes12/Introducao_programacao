package unidadetres;
import java.util.Scanner;
public class Uni3Exe07 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       System.out.println("Informe a quantidade de latas de 350 ml");
       int lata = teclado.nextInt();
       System.out.println("Informe a quantidade de garrafas de 600 ml");
       int garrafas = teclado.nextInt();
       System.out.println("Informe a quantidade de garrafas de 2L");
       int gar = teclado.nextInt();
       double mls = ((350*lata)/1000) + ((600*garrafas)/1000.0) + (gar * 2);     
       System.out.printf("O cliente comprou ao total %.2f litros%n ",mls);
       teclado.close();
   }
}
