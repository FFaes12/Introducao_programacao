package atividadesunidade2;
import java.util.Locale;
import java.util.Scanner;
                                          //conversão complicada
public class Uni2Exe15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor monetário: ");
        double valor = sc.nextDouble();

        
        int centavos = (int) Math.round(valor * 100);

        
        int[] notasMoedas = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
        String[] nomes = {"Nota de 100", "Nota de 50", "Nota de 20", "Nota de 10", "Nota de 5", "Nota de 2",
                          "Moeda de 1", "Moeda de 0.50", "Moeda de 0.25", "Moeda de 0.10", "Moeda de 0.05", "Moeda de 0.01"};

        System.out.println("NOTAS:");
        for (int i = 0; i < 6; i++) {
            int quantidade = centavos / notasMoedas[i];
            System.out.printf("%d %s(s)\n", quantidade, nomes[i]);
            centavos %= notasMoedas[i];
        }

        System.out.println("MOEDAS:");
        for (int i = 6; i < notasMoedas.length; i++) {
            int quantidade = centavos / notasMoedas[i];
            System.out.printf("%d %s(s)\n", quantidade, nomes[i]);
            centavos %= notasMoedas[i];
        }

        sc.close();
    }
}