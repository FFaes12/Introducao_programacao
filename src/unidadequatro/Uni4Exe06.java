package unidadequatro;

import java.util.Scanner;

public class Uni4Exe06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu sexo através dos caracteres seguintes:M(masculino), F(feminino) e I (não informado)");
        char s = teclado.next().charAt(0);
        s = Character.toUpperCase(s);
        if (s == 'M') {
            System.out.println("Masculino");
        } else if (s == 'F') {
            System.out.println("Feminino");
        } else if (s == 'I') {
            System.out.println("Não informado");
        } else {
            System.out.println("Entrada Incorreta");
        }
        teclado.close();
    }
}
