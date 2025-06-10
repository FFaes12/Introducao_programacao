package trabalhofinalprimeirosemestre;

import java.util.Random;
import java.util.Scanner;

public class Jogofeito { // <--- NOME DA CLASSE ALTERADO AQUI

    // Constantes do jogo
    private static final int TAMANHO_TABULEIRO = 8;
    private static final char AGUA = '~';
    private static final char NAVIO = 'N';
    private static final char ACERTO = 'A';
    private static final char ERRO = 'X';
    private static final int NUMERO_NAVIOS = 10;
    private static final int MAXIMO_JOGADAS = 30;

    // Variáveis de instância para o estado do jogo
    private char[][] tabuleiroReal;    // Contém a posição real dos navios e água
    private char[][] tabuleiroJogador; // O que o jogador vê (água, acertos, erros)
    private int naviosRestantes;
    private int jogadasFeitas;
    private Random random;
    private Scanner scanner;

    public static void main(String[] args) {
        new Jogofeito(); // <--- CHAMADA AO CONSTRUTOR ALTERADA AQUI
    }

    // Construtor: exibe a arte ASCII e inicia o jogo
    private Jogofeito() { // <--- NOME DO CONSTRUTOR ALTERADO AQUI
        // Sua arte ASCII
        System.out.println("                                                      :@*+%**%%=*%-.                                       \r\n" +
                           "                                                      :@%**+@=*@:.                                         \r\n" +
                           "                                                      :+...                                                 \r\n" +
                           "                                                      :+.                                                   \r\n" +
                           "      ___________________BATALHA NAVAL___________________  :+.                                                   \r\n" +
                           "                                                      :+.                                                   \r\n" +
                           "                                                      :+.                                                   \r\n" +
                           "                                                      :+.                                                   \r\n" +
                           "                                                      :+.                                                   \r\n" +
                           "                                                      :+.                                                   \r\n" +
                           "                                                    =**#%**=                                                \r\n" +
                           "                                                    #@@@@@@* \r\n" +
                           "                                                    %@@@@@@* \r\n" +
                           "                                               .-----@@@@@@@#--.                                          \r\n" +
                           "                                               :@@@@@@@@@@@@@@@=                                          \r\n" +
                           "                                               -@@@@@@@@@@@@@@@+.                                          \r\n" +
                           "                                          ..@@@@@@@@@@@@@@@@@@@@@#.                                       \r\n" +
                           "                                          .*@@@@@@@@@@@@@@@@@@@@@@..                                      \r\n" +
                           "                                          :%@@@@@@@@@@@@@@@@@@@@@@..                                      \r\n" +
                           "            .......@@@@@@@:              ......=@@@@@@@@@@@@@@@@@@@@@@@-..        #@@@@@@-.......         \r\n" +
                           "            .:::::-@@@@@@@:  .          %@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#.        %@@@@@@+:::::.          \r\n" +
                           "     .#@@@@@@@@@@@@@@@@@@@@@@@@@+     .+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.  .+***@@@@@@@%*********:      \r\n" +
                           "      .=@@@@@@@@@@@@@@@@@@@@@@@@+....:@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:...#@@@@@@@@@@@@@@@@@@@#.      \r\n" +
                           "        .%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:       \r\n" +
                           "         .=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=.       \r\n" +
                           "          :%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#.         \r\n" +
                           "           ..=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.         \r\n" +
                           "             ..%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@-          \r\n" +
                           "              .+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#.           \r\n" +
                           "                    ..........................................................................          \r\n" +
                           "                                                                                                      \r\n" +
                           "                                                                                                      ");

        // Inicializa os componentes do jogo
        tabuleiroReal = new char[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];
        tabuleiroJogador = new char[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];
        naviosRestantes = NUMERO_NAVIOS;
        jogadasFeitas = 0;
        random = new Random();
        scanner = new Scanner(System.in);

        // Prepara o jogo
        inicializarTabuleiros();
        posicionarNavios();

        // Inicia a partida
        iniciarPartida();
    }

    private void inicializarTabuleiros() {
        for (int i = 0; i < TAMANHO_TABULEIRO; i++) {
            for (int j = 0; j < TAMANHO_TABULEIRO; j++) {
                tabuleiroReal[i][j] = AGUA;
                tabuleiroJogador[i][j] = AGUA;
            }
        }
    }

    private void posicionarNavios() {
        int naviosColocados = 0;
        while (naviosColocados < NUMERO_NAVIOS) {
            int linha = random.nextInt(TAMANHO_TABULEIRO);
            int coluna = random.nextInt(TAMANHO_TABULEIRO);
            if (tabuleiroReal[linha][coluna] == AGUA) { // Garante que não sobreponha
                tabuleiroReal[linha][coluna] = NAVIO;
                naviosColocados++;
            }
        }
    }

    private void mostrarTabuleiro(char[][] tabuleiro) {
        System.out.print("  "); // Espaço para os números das colunas
        for (int i = 0; i < TAMANHO_TABULEIRO; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < TAMANHO_TABULEIRO; i++) {
            System.out.print(i + " "); // Números das linhas
            for (int j = 0; j < TAMANHO_TABULEIRO; j++) {
                // No tabuleiro do jogador, não revelamos navios não atingidos
                if (tabuleiro == tabuleiroJogador && tabuleiroReal[i][j] == NAVIO && tabuleiroJogador[i][j] == AGUA) {
                    System.out.print(AGUA + " ");
                } else {
                    System.out.print(tabuleiro[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }


    private void iniciarPartida() {
        System.out.println("\nBem-vindo à Batalha Naval!");

        while (jogadasFeitas < MAXIMO_JOGADAS && naviosRestantes > 0) {
            System.out.println("\n--- Tabuleiro do Jogador --- (Jogada " + (jogadasFeitas + 1) + "/" + MAXIMO_JOGADAS + ", Navios restantes: " + naviosRestantes + ")");
            mostrarTabuleiro(tabuleiroJogador);

            int linha = -1, coluna = -1;
            boolean entradaValidaParaAtaque = false;

            while(!entradaValidaParaAtaque){
                System.out.print("Digite a linha para atacar (0-" + (TAMANHO_TABULEIRO - 1) + "): ");
                if (scanner.hasNextInt()) {
                    linha = scanner.nextInt();
                } else {
                    System.out.println("Entrada inválida para linha. Por favor, insira um número.");
                    scanner.next(); // Consumir entrada inválida
                    continue;
                }

                System.out.print("Digite a coluna para atacar (0-" + (TAMANHO_TABULEIRO - 1) + "): ");
                if (scanner.hasNextInt()) {
                    coluna = scanner.nextInt();
                } else {
                    System.out.println("Entrada inválida para coluna. Por favor, insira um número.");
                    scanner.next(); // Consumir entrada inválida
                    continue;
                }

                if (linha < 0 || linha >= TAMANHO_TABULEIRO || coluna < 0 || coluna >= TAMANHO_TABULEIRO) {
                    System.out.println("Coordenadas inválidas! Estão fora do tabuleiro. Tente novamente.");
                } else {
                    entradaValidaParaAtaque = true;
                }
            }

            jogadasFeitas++;

            if (tabuleiroJogador[linha][coluna] == ACERTO || tabuleiroJogador[linha][coluna] == ERRO) {
                System.out.println("Você já atacou esta posição (" + linha + "," + coluna + "). Era um '" + tabuleiroJogador[linha][coluna] + "'.");
            } else if (tabuleiroReal[linha][coluna] == NAVIO) {
                System.out.println("BOOM! Você acertou um navio em (" + linha + "," + coluna + ")!");
                tabuleiroJogador[linha][coluna] = ACERTO;
                naviosRestantes--;
            } else { // Água
                System.out.println("SPLASH! Você errou o alvo em (" + linha + "," + coluna + "). Água!");
                tabuleiroJogador[linha][coluna] = ERRO;
            }

            if (naviosRestantes == 0) {
                break;
            }
        }

        fimDeJogo();
        scanner.close();
    }

    private void fimDeJogo() {
        System.out.println("\n=====================");
        System.out.println("--- FIM DE JOGO ---");
        System.out.println("=====================");
        System.out.println("Total de jogadas: " + jogadasFeitas);
        System.out.println("Navios destruídos: " + (NUMERO_NAVIOS - naviosRestantes) + " de " + NUMERO_NAVIOS);

        if (naviosRestantes == 0) {
            System.out.println("\n🎉 PARABÉNS! Você destruiu todos os navios e venceu a batalha! 🎉");
            mostrarTabuleiro(tabuleiroJogador); // Mostra o tabuleiro final do jogador com todos os acertos
        } else {
            System.out.println("\n QUE PENA! Você não conseguiu destruir todos os navios em " + MAXIMO_JOGADAS + " jogadas e perdeu. ");
        }

        System.out.println("\n--- Tabuleiro Real (Revelado) ---");
        // Monta um tabuleiro final para revelar tudo
        char[][] tabuleiroFinalRevelado = new char[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];
        for (int i = 0; i < TAMANHO_TABULEIRO; i++) {
            for (int j = 0; j < TAMANHO_TABULEIRO; j++) {
                if (tabuleiroJogador[i][j] == ACERTO) { // Navio acertado
                    tabuleiroFinalRevelado[i][j] = ACERTO;
                } else if (tabuleiroReal[i][j] == NAVIO) { // Navio não acertado
                    tabuleiroFinalRevelado[i][j] = NAVIO;
                } else if (tabuleiroJogador[i][j] == ERRO) { // Tiro na água
                    tabuleiroFinalRevelado[i][j] = ERRO;
                } else { // Água não atingida
                    tabuleiroFinalRevelado[i][j] = AGUA;
                }
            }
        }
        mostrarTabuleiro(tabuleiroFinalRevelado);
    }
}