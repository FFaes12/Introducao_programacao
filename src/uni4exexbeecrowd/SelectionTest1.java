package uni4exexbeecrowd;

import java.util.Scanner;

public class SelectionTest1 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       int A = teclado.nextInt();
       int B = teclado.nextInt();
       int C = teclado.nextInt();
       int D = teclado.nextInt();
       if ((B>C) && (D>A) && (C + D) > (B + A) && (C > 0) && (D>0) && (A%2==0)){
         System.out.println("Valores aceitos");
        }else{
         System.out.println("Valores nao aceitos");
       }
       teclado.close();
   }
}
