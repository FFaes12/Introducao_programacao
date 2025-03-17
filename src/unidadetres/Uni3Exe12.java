package unidadetres;
import java.util.Scanner;
public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe seu nome");
        String nome = teclado.nextLine();
        System.out.println("Informe seu numero de horas mensais trabalhadas");                      
        float hm = teclado.nextFloat();
        System.out.println("informe seu numero de dependentes");
        int dp = teclado.nextInt();
        float saltra = hm * 10;
        float salfamily = dp * 60;
        float salbru = saltra + salfamily;
        float descontoINSS = saltra * 0.085f;
        float descontoIR = saltra * 0.05f;
        float salliq = salbru - descontoINSS - descontoIR;
        System.out.printf("O funcionário %s possui um salário bruto de %.2f%n e um salario liquido de %.2f%n ",nome,salbru,salliq);
        teclado.close();
    }
}
