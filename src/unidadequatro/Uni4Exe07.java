package unidadequatro;
import java.util.Scanner;
public class Uni4Exe07 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      System.out.println("Informe o peso da carta em gramas");
      float peso = teclado.nextFloat();
      float valorpagar = 0;
      if (peso<50){
        System.out.println("Custo do selo: R$ 0,45");
      } else {
        float pesoexce = peso - 50;
        float qtAdicional = (pesoexce/20) +1;
        valorpagar = 0.45f + (0.45f * qtAdicional);
        System.out.println("Custo do selo "+ valorpagar);
      }
      teclado.close();
   }
}
