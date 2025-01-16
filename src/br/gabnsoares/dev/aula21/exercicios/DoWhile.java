package br.gabnsoares.dev.aula21.exercicios;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        System.out.println("## JIRA CLI ##");
        Scanner sc  = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("""
                    1 - CRIAR TAREFA
                    2 - CRIAR PROJETO
                    3 - SAIR
                    DIGITE UMA OPÇÃO:\s""");
            resposta = sc.nextLine();

            switch (resposta) {
                case "1":
                    // cria tarefa
                    System.out.println("Digite o nome da tarefa: ");
                    String nomeTarefa = sc.nextLine();
                    System.out.println("Tarefa [" + nomeTarefa + "] criada com sucesso!");
                    break;
                case "2":
                    // cria projeto
                    System.out.println("Digite o nome do projeto: ");
                    String nomeProjeto = sc.nextLine();
                    System.out.println("Projeto [" + nomeProjeto + "] criada com sucesso!");
                    break;
                case "3":
                    // encerrar sistema
                    System.out.println("Finalizando...");
                    break;
                default:
                    // valor não mapeado
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (!resposta.equalsIgnoreCase("3"));

        System.out.println("SISTEMA FINALIZADO!");
    }
}
