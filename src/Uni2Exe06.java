import java.util.Scanner;
public class Uni2Exe06 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);                                               //salario por dia de um funcionario e limite decimal
        System.out.println("informe seu numero de funcionario");                               
        int n1 = teclado.nextInt();
        System.out.println("informe seu numero de horas trabalhadas");
        int n2 = teclado.nextInt();
        System.out.println("Quanto voce recebe por hora?");
        double n3 = teclado.nextDouble();
        double salariodia = n2 * n3;

        System.out.printf("Você, funcionario numero "+ n1 + " recebeu cerca de %.2f\n pelo dia de hoje",salariodia);
        teclado.close();
    }
}
