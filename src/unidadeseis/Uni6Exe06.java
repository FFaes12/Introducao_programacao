package unidadeseis;

import java.util.Scanner;

public class Uni6Exe06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor (N): ");
        int n = teclado.nextInt();

        double[] vetor = new double[n];

        lerVetor(teclado, vetor);

        System.out.print("Informe um valor para buscar no vetor: ");
        double valorBusca = teclado.nextDouble();

        if (contemValor(vetor, valorBusca)) {
            System.out.println("O valor está cadastrado no vetor.");
        } else {
            System.out.println("O valor NÃO está cadastrado no vetor.");
        }
    }

  
    private static void lerVetor(Scanner teclado, double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o valor " + (i + 1) + ": ");
            vetor[i] = teclado.nextDouble();
        }
    }


    private static boolean contemValor(double[] vetor, double valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }
}