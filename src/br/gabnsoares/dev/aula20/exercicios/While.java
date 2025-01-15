package br.gabnsoares.dev.aula20.exercicios;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        System.out.println("""
                ## MONTANHA RUSSA DA DISNEY ##
                SISTEMA INICIALIZADO COM SUCESSO
                PARA SAIR DIGITE "Finalizar"
                -----------------------------------\s""");
        Scanner sc = new Scanner(System.in);

        String altura = "";

        while (!altura.equalsIgnoreCase("Finalizar")) {

            System.out.println("QUAL A ALTURA DO PASSAGEIRO EM CM?");

            altura = sc.nextLine();

            if (!altura.equalsIgnoreCase("Finalizar")) {

                double alturaDouble = Double.parseDouble(altura);

                if (alturaDouble > 1.60) {
                    System.out.println("** VIAGEM LIBERADA **");
                } else {
                    System.out.println("** VIAGEM NEGADA! **");
                }
            }
        }
        System.out.println("SISTEMA ENCERRADO COM SUCESSO!");
    }
}
