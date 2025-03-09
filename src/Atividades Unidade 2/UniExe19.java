import java.util.Scanner;
public class UniExe19 {
    public static void main(String[] args) {                                                 //logica entre valores
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor B");
        int b = teclado.nextInt();
        System.out.println("Informe o valor C");
        int c = teclado.nextInt();
        System.out.println("informe o valor d");
        int d = teclado.nextInt();
        int a = b;
        if (d == c) { 
        System.out.println("o valor A é " + a + " e o valor d é " + d);
        } else {
        System.out.println("O valor de C não é igual ao de D, execute denovo e insira valores iguais para descobir A");
        teclado.close();
        }












     }
}
