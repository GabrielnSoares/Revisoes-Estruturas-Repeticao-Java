package br.gabnsoares.dev.aula21.exercicios;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        String resposta;

        do {
            System.out.println("""
                    ## JIRA CLI ##
                    1 - CRIAR TAREFA
                    2 - CRIAR PROJETO
                    3 - SAIR
                    DIGITE UMA OPÇÃO:\s""");
            resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("1")) {
                System.out.println("Digite o nome da tarefa: ");
                String registro = sc.nextLine();
                System.out.println(registro + " criada com sucesso!");
            } else if (resposta.equalsIgnoreCase("2")) {
                System.out.println("Digite o nome do projeto: ");
                String registro = sc.nextLine();
                System.out.println(registro + " criado com sucesso!");
            }

        } while (!resposta.equalsIgnoreCase("3"));

        System.out.println("SISTEMA FINALIZADO!");
    }
}
