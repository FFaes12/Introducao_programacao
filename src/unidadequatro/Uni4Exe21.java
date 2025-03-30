package unidadequatro;

import java.util.Scanner;

public class Uni4Exe21 {
   public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Informe seu peso");
    float peso = teclado.nextFloat();
    System.out.println("Informe sua altura");
    float altura = teclado.nextFloat();

    double imc = (peso / Math.pow(altura, 2));
    if (imc < 18.5){
      System.out.println("Magreza");
    } else if (imc >= 18.5 && imc<= 24.9){
      System.out.println("Saudável");
    } else if (imc >= 25 && imc <= 29.9){
      System.out.println("Sobrepeso");
    } else if (imc >=30 && imc <=34.9){
      System.out.println("Obesidade grau 1");
    } else if (imc >=35 && imc <=39.9){
      System.out.println("Obesidade grau 2 (severa)");
    } else{
      System.out.println("Obesidade Grau 3 (mórbida)");
    }
    teclado.close();
  }  
}
