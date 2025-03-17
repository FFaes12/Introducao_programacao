package atividadesunidade2;
import java.util.Scanner;
public class Uni2Exe07 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner (System.in);                                                 //salairo vendedor com porcentagem e limite decimal
        System.out.println("Digite seu nome ");
        String nome = teclado.nextLine();
        System.out.println("Qual o valor de seu salario fixo? ");
        float n1 = teclado.nextFloat();
        System.out.println("Qual o valor total das vendas que voce efetuou esse mês ");
        float n2 = teclado.nextFloat();
        double valorbruto = n1 + 0.15 * n2;
        System.out.printf("o salario do funcionario "+ nome + " este mês ficou em %.2f\n", valorbruto);
        teclado.close();   
    }

}
