package unidadecinco;

public class Uni5Exe02 {
   public static void main(String[] args) {
      int somaimpar = 0;
      int somapar = 0;
      for (int contador = 1; contador <= 100; contador++){
        if (contador %2==0){
            somapar += contador;
        }else{
            somaimpar += contador;
        }
      }
      System.out.println("Soma todos numeros pares: "+ somapar);
      System.out.println("Soma de todos numeros imapres: "+ somaimpar);
   }
}
