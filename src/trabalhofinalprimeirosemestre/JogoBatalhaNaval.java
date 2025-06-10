package trabalhofinalprimeirosemestre;

import java.util.Random;
import java.util.Scanner;

public class JogoBatalhaNaval { 
  public static void main(String[] args) {
     new JogoBatalhaNaval();
   } 
   
  Scanner teclado = new Scanner(System.in);
  Random random = new Random();
  char[][] tabuleiroQueOPlayerVaiVer = new char [8][8];
  char[][] tabuleiroQueOPlayerNaoVaiVer = new char[8][8];
    int navios = 10;
    int acertos = 0;
    char mar = '~';
    char navio = 'N';
    char acerto = 'A';
    char erro = 'X';
    int tentativas = 30;
  

    public JogoBatalhaNaval() {
          System.out.println("                                                      :@*+%**%%=*%-.                                           \r\n" +
                "                                                      :@%**+@=*@:.                                                 \r\n" +
                "                                                      :+...                                                         \r\n" +
                "                                                      :+.                                                           \r\n" +
                "      ___________________BATALHA NAVAL_______________ :+.                                                           \r\n" +
                "                                                      :+.                                                           \r\n" +
                "                                                      :+.                                                           \r\n" +
                "                                                      :+.                                                           \r\n" +
                "                                                      :+.                                                           \r\n" +
                "                                                      :+.                                                           \r\n" +
                "                                                      =**#%**=                                                      \r\n" +
                "                                                      #@@@@@@* \r\n" +
                "                                                      %@@@@@@* \r\n" +
                "                                                .-----@@@@@@@#--.                                                   \r\n" +
                "                                                :@@@@@@@@@@@@@@@=                                                   \r\n" +
                "                                                -@@@@@@@@@@@@@@@+.                                                  \r\n" +
                "                                             ..@@@@@@@@@@@@@@@@@@@@@#.                                              \r\n" +
                "                                             .*@@@@@@@@@@@@@@@@@@@@@@..                                             \r\n" +
                "                                             :%@@@@@@@@@@@@@@@@@@@@@@..                                             \r\n" +
                "             .......@@@@@@@:            ......=@@@@@@@@@@@@@@@@@@@@@@@-..         #@@@@@@-.......          \r\n" +
                "             .:::::-@@@@@@@: .           %@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#.        %@@@@@@+:::::.           \r\n" +
                "      .#@@@@@@@@@@@@@@@@@@@@@@@@@+     .+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.   .+***@@@@@@@%*********:     \r\n" +
                "       .=@@@@@@@@@@@@@@@@@@@@@@@@+....:@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:...#@@@@@@@@@@@@@@@@@@@#.       \r\n" +
                "        .%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:        \r\n" +
                "         .=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=.        \r\n" +
                "          :%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#.         \r\n" +
                "           ..=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.         \r\n" +
                "             ..%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@-          \r\n" +
                "              .+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#.           \r\n" +
                "                    ..........................................................................         \r\n" +
                "                                                                                                    \r\n" +
                "                                                                                                    ");


        iniciarTabuleiro();
        randomizacaoDosNavios();
        tabuleiroQueOPlayerNaoVaiVer();
      
        oJogoMesmo();
        gameOver();
    }



    private void iniciarTabuleiro (){
        for (int i = 0; i < tabuleiroQueOPlayerVaiVer.length;i++){
            for (int j = 0; j < tabuleiroQueOPlayerVaiVer.length; j++) {
                tabuleiroQueOPlayerVaiVer[i][j] = mar;
                tabuleiroQueOPlayerNaoVaiVer[i][j] = mar;
            }
        }
    }

     private void randomizacaoDosNavios(){
        int i = 0;
        while (i < navios){
            int linha = random.nextInt(8);
            int coluna = random.nextInt(8);
            if (tabuleiroQueOPlayerNaoVaiVer[linha][coluna] == mar){
                tabuleiroQueOPlayerNaoVaiVer[linha][coluna] = navio;
                i++;
            }
        }
    }
         

    private void tabuleiroQueOPlayerNaoVaiVer(){
        for (int i=0; i<tabuleiroQueOPlayerNaoVaiVer.length;i++){
            for (int j = 0; j <tabuleiroQueOPlayerNaoVaiVer.length;j++){        
            }
        }
    }

    private void tabuleiroQueOPlayerVaiVer(){
     System.out.println("0 1 2 3 4 5 6 7");
        for (int i=0; i<tabuleiroQueOPlayerVaiVer.length;i++){
            for (int j = 0; j <tabuleiroQueOPlayerVaiVer.length;j++){
                System.out.print(tabuleiroQueOPlayerVaiVer[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    private void oJogoMesmo(){

        while (tentativas > 0 && acertos < navios){
        tabuleiroQueOPlayerVaiVer();    
        System.out.println("Há " + (navios - acertos) + " navios para afunndar");
        System.out.println("Você tem " + tentativas + " tentativas");
        System.out.println("Bom Jogo");


            System.out.println("Digite as coordenadas do tiro (linha e coluna):");
            int linha = teclado.nextInt();
            int coluna = teclado.nextInt();
            if (linha < 0 || linha >= 8 || coluna < 0 || coluna >= 8) {
                System.out.println("Coordenadas fora do campo. Tente novamente.");
                continue;
            }
            if (tabuleiroQueOPlayerNaoVaiVer[linha][coluna] == navio) {
                System.out.println("Acertou");
                tabuleiroQueOPlayerVaiVer[linha][coluna] = acerto;
                acertos++;

            } else if (tabuleiroQueOPlayerVaiVer[linha][coluna] == mar) {
                System.out.println("Mar");
                tabuleiroQueOPlayerVaiVer[linha][coluna] = erro;
            }else if (tabuleiroQueOPlayerVaiVer[linha][coluna] != mar) {
                System.out.println("\nVocê já atirou neste local! Tentativa gasta.");
                tentativas--; 
                continue;    
            }
            tentativas--;

        }
        
    }
    
    private void gameOver() {
        if (tentativas ==0 || acertos == navios) {
            System.out.println("__________FIM DE JOGO__________");
        } 
    }
}