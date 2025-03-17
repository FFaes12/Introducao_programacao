package atividadesunidade2;
import java.util.Scanner;
public class Uni2Exe11 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);

      System.out.println(" Insira um valor A ");
      float a = teclado.nextFloat();
      System.out.println(" Insira um valor B ");
      float b = teclado.nextFloat();
      System.out.println(" Insira o valor C ");
      float c = teclado.nextFloat();                                                  //calculo areas e exibição

      float triangulore = (a * c)/2;
      double areacirculo =  3.14159 * Math.pow (c, 2);
      float areatrapezio = ((a+b)*2)/2;
      double areaquadrado = Math.pow(b,2);
      float arearetangulo = a * b;


      System.out.println("a area do tringulo retangulo resulta em " + triangulore + " a area do circulo resulta em " + areacirculo);
      System.out.println("a area do trapezio é " + areatrapezio + " a area do quadrado resulta em " + areaquadrado);
      System.out.println("e a area do retangulo é "+ arearetangulo);

      teclado.close();


     }
}
