package unidadeseis;
import java.util.Scanner;

public class Uni6Exe02 {

  private Uni6Exe02() {
    Scanner teclado = new Scanner(System.in);
    float vetor[] = new float[12];

    
    vetorLer(teclado, vetor);
    float media = vetorCalculoDaMedia(vetor);
    mostrarMaioresQueMedia(vetor, media);

  }

 
  private void vetorLer(Scanner teclado, float[] vetor) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Informe o elemento " + (i + 1) + " vetor[" + i + "]: ");
      vetor[i] = teclado.nextFloat();
    }
  }


  private float vetorCalculoDaMedia (float vetor[]){
     float soma = 0;
     for (int i =0; i < vetor.length; i++){
        soma += vetor[i];
     }
     float media = soma / vetor.length;
     System.out.println("A média dos numeros é: " +media); 
     return media;
  }

  private void mostrarMaioresQueMedia (float vetor[],float media){
    for (int i = 0; i < vetor.length; i++){
        if (vetor[i]>media){
           System.out.println(vetor[i] + " é maior que a média");
        }
    }
  }



  public static void main(String[] args) {
    new Uni6Exe02();
  }

}