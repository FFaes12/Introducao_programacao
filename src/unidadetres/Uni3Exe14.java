package unidadetres;
import java.util.Scanner;
public class Uni3Exe14 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      System.out.println("Qual foi a sua distância percorrida durante essa viagem?");
      float dist = teclado.nextFloat();
      System.out.println("Quantas horas demoraram para realizar essa viagem?");
      float hrs = teclado.nextFloat();
      float gas = dist / 12;
      float vm = dist / hrs;
      System.out.printf("A velocidade média foi de %.2f%n km/h e a quantidade de combustível usado foi %.2f%n litros",vm,gas);
      teclado.close();
   }
}
