package unidadeseis;

import java.util.Scanner;

public class Uni6Exe07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;
        do {
            System.out.print("Informe o tamanho do vetor (até 20): ");
            n = teclado.nextInt();
        } while (n < 1 || n > 20);

        int[] vetor = new int[n];

        inserirValores(teclado, vetor);
        ordenarVetor(vetor);
        exibirVetor(vetor);
    }

   
    private static void inserirValores(Scanner teclado, int[] vetor) {
        int count = 0;
        while (count < vetor.length) {
            System.out.print("Digite um número inteiro para a posição " + (count + 1) + ": ");
            int valor = teclado.nextInt();
            if (!contemValor(vetor, count, valor)) {
                vetor[count] = valor;
                count++;
            } else {
                System.out.println("Valor já existe no vetor. Digite outro.");
            }
        }
    }

    
    private static boolean contemValor(int[] vetor, int tamanho, int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    
    private static void ordenarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    
    private static void exibirVetor(int[] vetor) {
        System.out.print("Vetor ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
        System.out.println();
    }
}