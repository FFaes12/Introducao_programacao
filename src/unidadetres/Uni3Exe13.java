package unidadetres;
import java.util.Scanner;
public class Uni3Exe13 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);                                                      
      System.out.println("Insira o comprimento da parede (metros)");
      double c = teclado.nextDouble();
      System.out.println("Insira a altura da parede (metros)");
      double al = teclado.nextDouble();
      double quantidadeazulejos = (c * al) * 9;
      double valor = quantidadeazulejos * 12.50;
      System.out.printf("O valor final é R$ %.2f%n ",valor);
      teclado.close();
    }
}
