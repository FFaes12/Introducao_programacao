import java.util.Scanner;
public class UniExe16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);


        System.out.println("Quantas latas serão compradas?");
        int quantidadeLatas = teclado.nextInt();
        System.out.println("Quantas garrafas de 600ml você irá comprar?");
        int quantidadeGarrafas600 = teclado.nextInt();
        System.out.println("Quantas garrafas de 2l você irá comprar?");
        int quantidadeGarrafas2L = teclado.nextInt();


        double capacidadeLata = 0.350;     
        double capacidadeGarrafa600 = 0.600; 
        double capacidadeGarrafa2L = 2.0;    

        double totalLitros = (quantidadeLatas * capacidadeLata) +
        (quantidadeGarrafas600 * capacidadeGarrafa600) +
        (quantidadeGarrafas2L * capacidadeGarrafa2L);

        System.out.println("O comerciante comprou um total de " + totalLitros + " litros de refrigerante.");
        teclado.close();
    }
}