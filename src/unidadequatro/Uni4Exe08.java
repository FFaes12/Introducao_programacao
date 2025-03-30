package unidadequatro;
import java.util.Scanner;

public class Uni4Exe08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe a letra:");
        char letra = teclado.next().charAt(0);
        if (letra == 'a' || letra =='e' ||letra == 'i' ||letra == 'o' ||letra == 'u'|| 
        letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("È vogal!");
        } else {
            System.out.println("NÂO é vogal");
        }
        teclado.close();
    }
}
