package Exercicios.EX2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe um número");
        var number = scanner. nextInt();
        var keepVerify = true;

        while (keepVerify){
            System.out.println("Informe um número para verificação");
            var toVery = scanner. nextInt();

            if (toVery < number){
                System.out.printf("Informe um número maior que %s \n", number);
            }

            var result = toVery % number;
            keepVerify = toVery % number == 0;
            System.out.printf("%s %% %s = %s \n", toVery, number, result);
        }
    }
}
