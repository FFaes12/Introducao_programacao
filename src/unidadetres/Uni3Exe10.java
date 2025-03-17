package unidadetres;
import java.util.Scanner;
public class Uni3Exe10 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       System.out.println("Insira a medida do cateto oposto");
       float co = teclado.nextFloat();
       System.out.println("Insira a medida do cateto adjacente");
       float ca = teclado.nextFloat();
       double hip = (Math.pow(ca, 2) + Math.pow(co, 2));
       double tiraraiz = Math.sqrt(hip);
       System.out.printf("A hipotenusa é: %.2f%n",tiraraiz);
       teclado.close();
   }
}
