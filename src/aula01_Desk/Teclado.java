package aula01_Desk;

import java.util.Scanner;

public class Teclado {
    private static Scanner scanner = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        System.out.println(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            scanner.next(); // descarta entrada inválida
        }
        int valor = scanner.nextInt();
        scanner.nextLine(); // consumir a nova linha
        return valor;
    }

    public static String lerString(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextLine();
    }
}
