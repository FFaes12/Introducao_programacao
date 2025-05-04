package unidadecinco;

import java.util.Scanner;



public class Uni5Exe09 {
  public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      int quantidadevintemais = 0;
      String nomesdezoito = "";
                                        
      System.out.println("Quantas entradas você ira digitar?");
      int n = teclado.nextInt();
      teclado.nextLine();

      for (int cont = 0; cont < n; cont ++){
           System.out.println("Digite o nome do aluno");
           String aluno = teclado.nextLine();
          
           System.out.println("Digite a idade do aluno:");
           int idade = teclado.nextInt();
           teclado.nextLine();

           if (idade>20){
              quantidadevintemais++;
           }
           if (idade==18){
            nomesdezoito += aluno + " e ";                             //como fazer o e nao aparecer no final tambem?:?????????
          
           }
        }    
        System.out.println("Quantidade de alunos que tem idade acima de 20 anos: "+ quantidadevintemais);
        System.out.println("Nomes de alunos que tem 18 anos: "+ nomesdezoito);
    }
}
