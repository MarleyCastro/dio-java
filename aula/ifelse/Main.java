package ifelse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        var cabDrive =  ((age >= 18) ||(age >= 16 && isEmancipated));
        //
        var menssage = cabDrive ?
                name + " , Você pode dirigir \n" : //true
                name + ", Não podera dirigir \n"; //false

        System.out.println(menssage);
        System.out.println("Fim da execução");
    }
}
