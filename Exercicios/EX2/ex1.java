package Exercicios.EX2;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int number = scanner.nextInt();

        int result=0;
        for (int i=1; i < 11; i++){
              result = i* number;
            System.out.println(number +" X " + i +" = "+ result);
        }
    }
}
