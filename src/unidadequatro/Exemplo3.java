package unidadequatro;

import java.util.Scanner;

public class Exemplo3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        int numero1 = teclado.nextInt();
        System.out.println("digite o segundo numero");
        int numero2 = teclado.nextInt();
        System.out.println("informe o operador");
        char operator = teclado.next().charAt(0);
        double resultado = 0;
        if  (operator == '+') {
            resultado = numero1 + numero2;
        } else if (operator == '-') {
            resultado = numero1 - numero2;
        } else if (operator == '*') {
            resultado = numero1 * numero2;
        } else if (operator == '/') {
          if (numero1 != 0 && numero2 !=0)
            resultado = numero1 / numero2;
        } else {
            resultado = 0;
        }
        System.out.println("Resultado:" + resultado);
        teclado.close();
    }

}
