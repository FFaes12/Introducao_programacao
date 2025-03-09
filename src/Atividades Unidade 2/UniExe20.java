import java.util.Scanner;
public class UniExe20 {                                                                                             //calculo potencia quadrados
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Insira a quantidade de dobras que irão ser feitas no papel, o valor deve ser par");
        int d = teclado.nextInt();
        double nd = Math.pow(d, 2);
        if (d % 2 == 0){
        System.out.println("O numero de quadrados visiveis após as dobras é de " + nd);                        
        }else {
        System.out.println("O numero deve ser par, não leu o que tava escrito????");
        }
        teclado.close();
    }
}
