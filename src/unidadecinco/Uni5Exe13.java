package unidadecinco;

import java.util.Scanner;

public class Uni5Exe13 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
       System.out.println("Quantas paradas para reabastecimento houveram");
       int paradas = teclado.nextInt();
       double somaporlitro =0;
       double media = 0;
       for (int contador = 1; contador <= paradas; contador ++){
            System.out.println("Qual a quilometragem parada");
            double quilometragem = teclado.nextDouble();
            System.out.println("Qual a quantidade de combustivel nessa parada");
            double combustivel = teclado.nextDouble();
            double porlitro = quilometragem/combustivel;
            somaporlitro += porlitro;
            media = somaporlitro / paradas;    
        }
       System.out.println("Quilometragem média obritda por litro: "+ media);
       teclado.close();
   }
}
