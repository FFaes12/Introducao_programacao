import java.util.Scanner;
public class Uni2Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Insira o primeiro valor do eixo X");
        float x = teclado.nextFloat();
        System.out.println("Insira o segundo valor do eixo x");
        float xx = teclado.nextFloat();
        System.out.println("Insira o primeiro valor do eixo y");
        float y = teclado.nextFloat();
        System.out.println("Insira o segundo valor do eixo Y");
        float yy = teclado.nextFloat();
        double conta = Math.pow(xx-x, 2);
        double conta2 = Math.pow(yy-y, 2);
        double conta3 = conta + conta2;
        double raiz =  Math.sqrt(conta3);
        System.out.printf("O resultado da equação requisitada é %.4f\n " ,raiz);
        teclado.close();

    }

}
