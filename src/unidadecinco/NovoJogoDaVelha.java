package unidadecinco;
public class NovoJogoDaVelha {
    public static void main(String[] args) {
        int linha = 0;

        while (linha < 3) {
            int coluna = 0;
            while (coluna < 3) {
                if (linha < 2) {
                    System.out.print("_");
                } else {
                    System.out.print(" ");
                }

                if (coluna < 2) {
                    System.out.print("|");
                }

                coluna++;
            }
            System.out.println(); 
            linha++;
        }
    }
}