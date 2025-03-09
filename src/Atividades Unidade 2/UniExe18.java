import java.util.Scanner;
public class UniExe18 {
     public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);                                                         //area vezes valor
       System.out.println("Insira o comprimento da parede (metros)");
       double c = teclado.nextDouble();
       System.out.println("Insira a altura da parede (metros)");
       double al = teclado.nextDouble();
       double quantidadeazulejos = (c * al) * 9;
       double valor = quantidadeazulejos * 12.50;
       System.out.println("O preço total da compra desses azulejos é cerca de " +valor);
       teclado.close();
    }
}
