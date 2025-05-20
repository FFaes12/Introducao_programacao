import java.util.Scanner;

public class prova20052025 {
    public static void main(String[] args) {
        new prova20052025();
    }

    private String[] bolsa;
    private int[] kgItens;
    private int limitePeso;
    private int pesoNaBolsa = 0;
    private int qtdNaBolsa = 0;

    private prova20052025() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual o tamanho da bolsa? ");
        int tamanho = teclado.nextInt();
        System.out.print("Qual o peso máximo que a bolsa aguenta? ");
        limitePeso = teclado.nextInt();
        bolsa = new String[tamanho];
        kgItens = new int[tamanho];

        int escolha;
        do {
            System.out.println("==== MENU DA BOLSA ====");
            System.out.println("1 - Colocar item na bolsa");
            System.out.println("2 - Listar bolsa de trás pra frente");
            System.out.println("3 - Ver item mais pesado");
            System.out.println("4 - Arrumar bolsa por peso");
            System.out.println("5 - Tirar item pelo nome");
            System.out.println("6 - Ver tudo na bolsa");
            System.out.println("7 - Sair do programa");
            System.out.print("Sua escolha: ");
            escolha = teclado.nextInt();
            teclado.nextLine();

            switch (escolha) {
                case 1:
                    qtdNaBolsa = inserir(bolsa, kgItens, qtdNaBolsa, limitePeso, pesoNaBolsa, teclado);
                    pesoNaBolsa = calcularPesoAtual(kgItens, qtdNaBolsa);
                    break;
                case 2:
                    imprimirMochila(bolsa, kgItens, qtdNaBolsa);
                    break;
                case 3:
                    valorItemMaisPesado(bolsa, kgItens, qtdNaBolsa);
                    break;
                case 4:
                    ordenarMochila(bolsa, kgItens, qtdNaBolsa);
                    verBolsa(bolsa, kgItens);
                    break;
                case 5:
                    qtdNaBolsa = excluirItemMochila(bolsa, kgItens, qtdNaBolsa, teclado);
                    pesoNaBolsa = calcularPesoAtual(kgItens, qtdNaBolsa);
                    break;
                case 6:
                    verBolsa(bolsa, kgItens);
                    break;
                case 7:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        } while (escolha != 7);

        teclado.close();
    }

   
    private int inserir(String[] bolsa, int[] kgItens, int qtdNaBolsa, int limitePeso, int pesoNaBolsa, Scanner teclado) {
        if (qtdNaBolsa >= bolsa.length) {
            System.out.println("Bolsa cheia, não cabe mais nada");
            return qtdNaBolsa;
        }
        System.out.print("Nome do item: ");
        String nome = teclado.nextLine();
        System.out.print("Peso do item (kg): ");
        int peso = teclado.nextInt();
        teclado.nextLine();
        if (pesoNaBolsa + peso > limitePeso) {
            System.out.println("Esse item é muito pesado, escreva outro");
            return qtdNaBolsa;
        }
        bolsa[qtdNaBolsa] = nome;
        kgItens[qtdNaBolsa] = peso;
        System.out.println("Item colocado");
        return qtdNaBolsa + 1;
    }

    
    private void imprimirMochila(String[] bolsa, int[] kgItens, int qtdNaBolsa) {
        if (qtdNaBolsa == 0) {
            System.out.println("bolsa esta vazia");
            return;
        }
        System.out.println("Bolsa (de trás pra frente):");
        for (int i = qtdNaBolsa - 1; i >= 0; i--) {
            System.out.println("[" + bolsa[i] + "] - Peso: " + kgItens[i]);
        }
    }


    private void valorItemMaisPesado(String[] bolsa, int[] kgItens, int qtdNaBolsa) {
        if (qtdNaBolsa == 0) {
            System.out.println("Bolsa vazia.");
            return;
        }
        int maior = kgItens[0];
        int pos = 0;
        for (int i = 1; i < qtdNaBolsa; i++) {
            if (kgItens[i] > maior) {
                maior = kgItens[i];
                pos = i;
            }
        }
        System.out.println("Item mais pesado: " + bolsa[pos] + " (" + maior + "kg)");
    }


    private void ordenarMochila(String[] bolsa, int[] kgItens, int qtdNaBolsa) {
        for (int i = 0; i < qtdNaBolsa - 1; i++) {
            for (int j = 0; j < qtdNaBolsa - 1 - i; j++) {
                if (kgItens[j] > kgItens[j + 1]) {
                    int auxPeso = kgItens[j];
                    kgItens[j] = kgItens[j + 1];
                    kgItens[j + 1] = auxPeso;
                    String auxNome = bolsa[j];
                    bolsa[j] = bolsa[j + 1];
                    bolsa[j + 1] = auxNome;
                }
            }
        }
        System.out.println("Bolsa arrumada por peso dos itens nela");
    }
    private int excluirItemMochila(String[] bolsa, int[] kgItens, int qtdNaBolsa, Scanner teclado) {
        int pos = pesquisarItem(bolsa, qtdNaBolsa, teclado);
        if (pos == -1) {
            return qtdNaBolsa;
        }
        for (int i = pos; i < qtdNaBolsa - 1; i++) {
            bolsa[i] = bolsa[i + 1];
            kgItens[i] = kgItens[i + 1];
        }
        bolsa[qtdNaBolsa - 1] = null;
        kgItens[qtdNaBolsa - 1] = 0;
        System.out.println("Removido da bolsa");
        return qtdNaBolsa - 1;
    }

    private void verBolsa(String[] bolsa, int[] kgItens) {
        System.out.println("Bolsa atual:");
        for (int i = 0; i < bolsa.length; i++) {
            System.out.print((i + 1) + "º: ");
            if (bolsa[i] != null) {
                System.out.print(bolsa[i]);
            } else {
                System.out.print("vazio");
            }
            System.out.print(" | ");
        }
        System.out.println();
        System.out.print("Pesos: ");
        for (int i = 0; i < kgItens.length; i++) {
            System.out.print("[" + kgItens[i] + "]");
        }
        System.out.println();
    }

        private int pesquisarItem(String[] bolsa, int qtdNaBolsa, Scanner teclado) {
        System.out.print("Digite o nome do item para pesquisar: ");
        String nome = teclado.nextLine();
        for (int i = 0; i < qtdNaBolsa; i++) {
            if (bolsa[i] != null && bolsa[i].equals(nome)) {
                System.out.println("Item encontrado na posição " + (i + 1));
                return i;
            }
        }
        System.out.println("Item não encontrado");
        return -1;
    }
    private int calcularPesoAtual(int[] kgItens, int qtdNaBolsa) {
        int soma = 0;
        for (int i = 0; i < qtdNaBolsa; i++) {
            soma += kgItens[i];
        }
        return soma;
    }
}