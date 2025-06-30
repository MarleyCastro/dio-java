package Exercicios.EX2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite um número");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número maior que o primeiro");
        num2 = scanner.nextInt();

        while (num2 <= num1){
            System.out.println("Digite um número maior!!");
            System.out.println("Digite um numero maior");
            num2 = scanner.nextInt();
        }

        System.out.printf("Deseja ver números pares ou ímpares? (par/impar):");
        String choice = scanner.next().toLowerCase();

        System.out.println("Números " + choice + " no intervalo entre " + num1 + " e " + "(ordem decresente)");

        for (int i = num2; i >= num1; i--){
            if (choice.equals("par") && i % 2 == 0){
                System.out.println(i);
            }else{
                System.out.println(i);
            }
        }
    }
}
