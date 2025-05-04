package unidadecinco;

import java.util.Scanner;

public class Uni5exe17 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    float atletaInscricao = -1;
    float atletaaltura = 0;
    float atletamaisaltoinscricao = 0;
    float atletamaisbaixoinscricao = 0;
    float atletamaisbaixoaltura = 0;
    double atletaalturamediasoma = 0;
    double atletaalturamediaqtd = 0;
    double atletaMenor = Double.MAX_VALUE;
    double atletaMaior = Double.MIN_VALUE;

    while (atletaInscricao != 0){
      System.out.println("Informe o numero de inscrição do atleta (digite 0 para encerrar)");
      atletaInscricao = teclado.nextFloat();

      if (atletaInscricao == 0){
        break;
      }

      System.out.println("Informe a altura do atleta");
      atletaaltura = teclado.nextFloat();

      if (atletaaltura>0){
        atletaalturamediaqtd++;
        atletaalturamediasoma += atletaaltura;
      }

      if (atletaaltura > atletaMaior) {
        atletaMaior = atletaaltura;
        atletamaisaltoinscricao = atletaInscricao;
      }

    
      if (atletaaltura < atletaMenor) {
        atletaMenor = atletaaltura;
        atletamaisbaixoinscricao = atletaInscricao;
     }
   }
     
    if (atletaalturamediaqtd>0){
      double mediaalturas = atletaalturamediasoma/atletaalturamediaqtd;
      System.out.println("O atleta mais alto tem " + atletaMaior + "e seu numero de inscrição é " + atletamaisaltoinscricao);
      System.out.println("O atleta mais baixo tem " + atletaMenor + " e seu numero de inscrição é " + atletamaisbaixoinscricao);
      System.out.println("altura média do grupo de atletas é: "+ mediaalturas);
    } else {
      System.out.println("Não tem atletas");
    }
    teclado.close();
  }
}
