package atividadesunidade2;
import java.util.Scanner;
public class Uni2Exe13 {
       public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);                                                                  //distancia entre um carro e outro
       System.out.println("Informe a distancia desejada entre um carro e o outro (KM)");
       double d = teclado.nextDouble();
       double tempo = (d/(90-60)) * 60;
       System.out.println("o tempo necessario em minutos para um carro tomar essa distância do outro carro é cerca de " + tempo);
       teclado.close();


      
    
    
    
    }
}
