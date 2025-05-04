package unidadecinco;
public class Uni5Exe10 {
  public static void main(String[] args) {
    for (int contador = 0; contador < 10000; contador++){
      int primeirametade = contador / 100;
      int segundametade = contador % 100;              
      int soma = primeirametade + segundametade;
      if (soma * soma == contador)                             //nao existem 10 numeros com essa propriedade!
      System.out.println(contador);
    }
  }
}
                        