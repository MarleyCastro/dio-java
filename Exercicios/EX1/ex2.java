//Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
package Exercicios.EX1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        double area, side;

        System.out.println("Informe o comprimeto do quadrado: ");
        side = scanner.nextInt();

        area = side * side;

        System.out.printf("A area do quadrado e : %.2f", area);

    }
}
