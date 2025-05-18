package unidadeseis;

import java.util.Scanner;

public class Uni6Exe04 {

    public Uni6Exe04() {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3;

        Scanner teclado = new Scanner(System.in);

    
        lerVetor(teclado, vetor1, "primeiro");
        lerVetor(teclado, vetor2, "segundo");

  
        vetor3 = somarVetores(vetor1, vetor2);

       
        System.out.print("Vetor 1: ");
        escreverVetor(vetor1);

        System.out.print("Vetor 2: ");
        escreverVetor(vetor2);

        System.out.print("Vetor 3 (soma): ");
        escreverVetor(vetor3);
    }

   
    private void lerVetor(Scanner teclado, int[] vetor, String nome) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor do " + nome + " vetor: ");
            vetor[i] = teclado.nextInt();
        }
    }

   
    private int[] somarVetores(int[] v1, int[] v2) {
        int[] soma = new int[v1.length];
        for (int i = 0; i < v1.length; i++) {
            soma[i] = v1[i] + v2[i];
        }
        return soma;
    }


    private void escreverVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new Uni6Exe04();
    }
}