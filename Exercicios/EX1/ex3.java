//Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela
package Exercicios.EX1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        double basis, area,height;

        System.out.println("Informe a base do triângulo: ");
        basis = scanner.nextInt();

        System.out.println("Informe a altura do triângulo");
        height = scanner.nextInt();

        area = basis * height;

        System.out.printf("A area do quadrado e : %.2f", area);

    }
}
