import java.util.Scanner;
public class Uni2Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quantos segundos dura o evento");
        int n1 = teclado.nextInt();
        int horas = n1 / 3600;
        int minutos =  (n1 % 3600) /60;                                                        //visualização horas,minutos,segundos
        int segundos = n1 % 60;
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
        teclado.close();
    }
}
