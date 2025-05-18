package unidadeseis;

import java.util.Scanner;

public class Uni6Exe10 {

    private Uni6Exe10() {
        int opcao = 0;
        int vet[] = new int[50];
        int posicao = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("\nMENU");
            System.out.println("1- Incluir valor");
            System.out.println("2- Pesquisar valor");
            System.out.println("3- Alterar valor");
            System.out.println("4- Excluir valor");
            System.out.println("5- Mostrar valores");
            System.out.println("6- Ordenar valores");
            System.out.println("7- Inverter valores");
            System.out.println("8- Sair do sistema");
            System.out.print("Digite o número de sua opção: ");
            opcao = teclado.nextInt();
            System.out.println("Opção digitada: " + opcao);

            switch (opcao) {
                case 1:
                    posicao = incluirValor(vet, posicao, teclado);
                    break;
                case 2:
                    pesquisarValor(vet, posicao, teclado);
                    break;
                case 3:
                    alterarValor(vet, posicao, teclado);
                    break;
                case 4:
                    posicao = excluirValor(vet, posicao, teclado);
                    break;
                case 5:
                    mostrarValores(vet, posicao);
                    break;
                case 6:
                    ordenarValores(vet, posicao);
                    break;
                case 7:
                    inverterValores(vet, posicao);
                    break;
                case 8:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 8);

        teclado.close();
    }

    public static void main(String[] args) {
        new Uni6Exe10();
    }

    private int incluirValor(int[] vet, int posicao, Scanner teclado) {
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();
        if (posicao < vet.length) {
            vet[posicao] = numero;
            System.out.println("Número incluído no vetor: " + numero + " na posição " + posicao);
            return posicao + 1;
        } else {
            System.out.println("Vetor cheio.");
            return posicao;
        }
    }

    private int pesquisarValor(int[] vet, int posicao, Scanner teclado) {
        System.out.print("Digite um valor para pesquisar: ");
        int numero = teclado.nextInt();
        for (int i = 0; i < posicao; i++) {
            if (vet[i] == numero) {
                System.out.println("Valor encontrado na posição " + i);
                return i;
            }
        }
        System.out.println("Valor não encontrado.");
        return -1;
    }

    private void alterarValor(int[] vet, int posicao, Scanner teclado) {
        int indice = pesquisarValor(vet, posicao, teclado);
        if (indice >= 0) {
            System.out.print("Digite o novo número para substituir: ");
            int novoNumero = teclado.nextInt();
            vet[indice] = novoNumero;
            System.out.println("Valor alterado com sucesso.");
        } else {
            System.out.println("Número a ser alterado não encontrado.");
        }
    }

    private int excluirValor(int[] vet, int posicao, Scanner teclado) {
        int indice = pesquisarValor(vet, posicao, teclado);
        if (indice != -1) {
            for (int i = indice; i < posicao - 1; i++) {
                vet[i] = vet[i + 1];
            }
            posicao--;
            System.out.println("Valor excluído.");
        } else {
            System.out.println("Valor não encontrado para exclusão.");
        }
        return posicao;
    }

    private void mostrarValores(int[] vet, int posicao) {
        if (posicao == 0) {
            System.out.println("Nenhum valor no vetor.");
        } else {
            System.out.println("Valores armazenados:");
            for (int i = 0; i < posicao; i++) {
                System.out.println("[" + i + "] = " + vet[i]);
            }
        }
    }

    private void ordenarValores(int[] vet, int posicao) {
        for (int i = 0; i < posicao - 1; i++) {
            for (int j = 0; j < posicao - i - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    int temp = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = temp;
                }
            }
        }
        System.out.println("Valores ordenados em ordem crescente.");
    }

    private void inverterValores(int[] vet, int posicao) {
        for (int i = 0; i < posicao / 2; i++) {
            int temp = vet[i];
            vet[i] = vet[posicao - 1 - i];
            vet[posicao - 1 - i] = temp;
        }
        System.out.println("Valores invertidos.");
    }
}