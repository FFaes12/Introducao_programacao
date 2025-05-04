package unidadecinco;

import java.util.Scanner;

public class Uni5Exe14 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    float lucrodezporcento = 0;
    float lucroentredezevinte = 0;
    float lucroacimavinte = 0;
    float todascompras = 0;
    float todasvendas = 0;
    float lucrototal = 0;
    for (int contador = 1; contador <= 20; contador ++){
      System.out.println("Insira o nome da mercadoria");
      String nome = teclado.nextLine();

      System.out.println("Insira o preço de compra da mercadoria");
      float pc = teclado.nextFloat();

      System.out.println("Insira o preço de venda da mercadoria");
      float pv = teclado.nextFloat();

      teclado.nextLine();

      float lucro = (pv - pc) / pc * 100;

      if (lucro < pc * 0.1 ){
       lucrodezporcento++;
      }
      if (lucro <= pc * 0.2 && lucro >= pc *0.1 ){
       lucroentredezevinte++;
      }
      if (lucro > pc * 0.2){
       lucroacimavinte++;
      }
      if (pc>0){
        pc =+ todascompras;
      }
      if (pv>0){
        pv =+ todasvendas;
      }
      lucrototal = todascompras - todasvendas;
    }
    System.out.println("Quantidade de mercadorias com lucro acima de 20%: "+ lucroacimavinte);  
    System.out.println("Quantidade de mercadorias com lucro entre 10% e 20%: "+ lucroentredezevinte); 
    System.out.println("Quantidade de mercadorias com lucro menor que 10%: "+ lucrodezporcento);
    System.out.println("Valor total de compra: "+ todascompras);
    System.out.println("Valor total de vendas: "+ todasvendas);
    System.out.println("Lucro total: "+ lucrototal);
    teclado.close();  
 }
}
