package unidadecinco;

import java.util.Scanner;

public class Uni5Exe18 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      int canal = -1;
      int pessoas = 0;
      int canalquatro = 0;
      int canalcinco = 0;
      int canalnove = 0;
      int canaldoze = 0;
      int totalPessoas = 0;


      while (canal != 0){
          System.out.println("Informe que canal de TV voce assiste (4, 5, 9, 12 ou 0 para encerrar)");
          canal = teclado.nextInt();
          if (canal == 0){
            break;
          }

          System.out.println ("Em quantas pessoas você assiste esse canal?");
          pessoas = teclado.nextInt();
          
          totalPessoas += pessoas;

          switch (canal) {
              case 4 : 
                  canalquatro += pessoas;
                  break;
             case 5 : 
                  canalcinco += pessoas;
                  break;
             case 9 : 
                  canalnove += pessoas;
                  break;
             case 12 : 
                  canaldoze += pessoas;
                  break;
              default:
              System.out.println("Canal inválido.");             
            }
        }
        System.out.println("Percentual de audiência do canal 4: "+ canalquatro * 100 / totalPessoas +"%" );
        System.out.println("Percentual de audiência do canal 5:"+ canalcinco * 100 / totalPessoas +"%");
        System.out.println("Percentual de audiência do canal 9:"+ canalnove * 100 / totalPessoas +"%");
        System.out.println("Percentual de audiência do canal 12:"+canaldoze * 100 / totalPessoas +"%");
        teclado.close();
   } 
}
