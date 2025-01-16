package br.gabnsoares.dev.aula22.exercicios;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {

        System.out.println("# DESEMPENHOS - ORACLE PEOPLESOFT #");
        System.out.println("QUAL A QUANTIDADE DE MEMBROS NO SEU TIME?");

        Scanner sc  = new Scanner(System.in);
        int membros = sc.nextInt();
        sc.nextLine();
        int nota;
        int somatorio = 0;

        for (int c = 1; c <= membros; c++) {
            System.out.println("DIGITE A NOTA DO MEMBRO " + c + ":");
            nota = sc.nextInt();
            sc.nextLine();
            if (nota > 1 && nota <= 10) {
                somatorio = somatorio + nota;
            } else {
                System.out.println("Digite uma nota válida entre (1 a 10)");
                c--;
            }
        }
        System.out.println("PESQUISA FINALIZADA!");
        System.out.println("GERANDO MEDIA DO TIME...");
        System.out.println("O DESEMPENHO MEDIO DO TIME É: " + (somatorio/membros));
    }
}
