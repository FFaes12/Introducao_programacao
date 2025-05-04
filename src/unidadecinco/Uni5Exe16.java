package unidadecinco;

import java.util.Scanner;

public class Uni5Exe16 {

   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      float altura = 1;
      float somaalturatotal = 0;
      float quantidademulheres = 0;
      float somaalturamulheres = 0;
      float quantidadealturastotal = 0;
      float mediaalturamulheres = 0;
      float mediaalturagrupo = 0;

     while (altura != 0) {
         System.out.println("Informe sua altura (digite 0 para encerrar o programa)");
         altura = teclado.nextFloat();

         if (altura == 0) {
            break;
         }

         System.out.println("Informe seu genero: F/M/O (O=Outro)");
         String genero = teclado.next().toUpperCase();

         if  (genero.equals("F")) {
            quantidademulheres++;
            somaalturamulheres += altura;
         }

         if (altura > 0) {
            quantidadealturastotal++;
            somaalturatotal += altura;
         }
      }

      if (quantidademulheres > 0) {
        mediaalturamulheres = somaalturamulheres / quantidademulheres;
      } else {
         System.out.println("Média da altura das mulheres = 0 ");
      }

      if (quantidadealturastotal > 0) {
       mediaalturagrupo = somaalturatotal / quantidadealturastotal;
      } else {
         System.out.println("Nenhum dado registrado");
      }

      System.out.println("Media da altura das mulheres = " + mediaalturamulheres);
      System.out.println("A média da altura do grupo é " + mediaalturagrupo);
      teclado.close();
  }

}
