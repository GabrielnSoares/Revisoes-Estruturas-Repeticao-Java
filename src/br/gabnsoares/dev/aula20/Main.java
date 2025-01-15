package br.gabnsoares.dev.aula20;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // while

        System.out.println("Digite um número");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.nextLine();

        while (numero > 0) {

            System.out.println(numero);

            numero--;
        }
        System.out.println("Feliz Ano Novo!");
    }
}
