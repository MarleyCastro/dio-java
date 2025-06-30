//Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
package Exercicios.EX1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String name;

        System.out.println("Qual seu nome?");
        name = scanner.next();

        System.out.println("Ola "+ name);
    }
}
