package uni4exexbeecrowd;

import java.util.Scanner;

public class SelectionTest3 {
   public static void main(String[] args) {
     Scanner teclado = new Scanner (System.in);
     float x = teclado.nextFloat();
     float y = teclado.nextFloat();

     if ((x==0) && (y==0)){
        System.out.println("Ponto de origem");
     }



   }
}



private void teste (int vetor[], int tamanho,int numero){
   int aux = 0;
   for (int i = 0; i<tamanho;i++){
      for (int j = 0; j<i; j++) {
         aux = vet[i];
         vet[i] = vet[j];
         vet[j] = aux;
      }
      numero++;
   }
}
//construtor
int vetor[5] = {10,5,3,8,9};
int numero = Vector.lenght;
vetor = teste (vetor,5,numero);