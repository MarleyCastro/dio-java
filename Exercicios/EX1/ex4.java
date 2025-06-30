//Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
package Exercicios.EX1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int age1, age2, ages;

        System.out.println("Qual a idade da 1° pessoa");
        age1 = scanner.nextInt();

        System.out.println("Qual a idade da 2° pessoa");
        age2 = scanner.nextInt();

        ages = age1 - age2;

        System.out.println("Diferença de idade é "+ ages);

    }
}
