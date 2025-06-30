package Exercicios.EX2;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var scanner = new Scanner(System.in);

        double heigth,weight, IMC;

        System.out.println("Qual a sua altura? ");
        heigth = scanner.nextDouble();

        System.out.println("Qual é seu peso?");
        weight = scanner.nextDouble();

        IMC = weight/(heigth * heigth);

        if (IMC <= 18.5){
            System.out.println("Abaixo do peso");
        }if (IMC >= 18.6 && IMC <= 24.9){
            System.out.println("Peso ideal");
        }if (IMC >= 25.0 && IMC <=29.9){
            System.out.println("Levemente acima do peso");
        }if (IMC >= 30.0 && IMC <= 34.9){
            System.out.println("Obesidade Grau I");
        }if (IMC >= 35.0 && IMC <= 39.9){
            System.out.println("Obesidade Grau II (Severa)");
        }if (IMC >= 40.0){
            System.out.println("Obesidade III (Mórbida)");
        }
    }
}
