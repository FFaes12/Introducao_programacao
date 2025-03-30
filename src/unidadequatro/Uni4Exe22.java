package unidadequatro;

import java.util.Scanner;

public class Uni4Exe22 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 1- para Bacharel em Ciência da Computação\", \"Digite 2- para Licenciatura em Computação\" e \"Digite 3- para Bacharel em Sistemas de Informação\".");
        int opc = teclado.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Bacharel em Ciências da computação");
                break;
            case 2:
                System.out.println("Licenciatura em Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
            default:
            System.out.println("Insira um dos digitos requisitados");
            break;
            
        }
        teclado.close();
    }
}
