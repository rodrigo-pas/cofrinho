package br.uninter.rodrigo.cofrinho;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("\n### Menu ###");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total convertido para Real");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o scanner

            switch (opcao) {
                case 1:
                    adicionarMoeda(scanner, cofrinho);
                    break;
                case 2:
                    removerMoeda(scanner, cofrinho);
                    break;
                case 3:
                    listarMoedas(cofrinho);
                    break;
                case 4:
                    calcularTotalConvertido(cofrinho);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }

    private static void adicionarMoeda(Scanner scanner, Cofrinho cofrinho) {
        System.out.print("Digite o valor da moeda: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Limpa o scanner

        System.out.print("Digite o tipo da moeda (Dolar, Euro, Real): ");
        String tipo = scanner.nextLine().trim();

        Moeda moeda;
        switch (tipo.toLowerCase()) {
            case "dolar":
                moeda = new Dolar(valor);
                break;
            case "euro":
                moeda = new Euro(valor);
                break;
            case "real":
                moeda = new Real(valor);
                break;
            default:
                System.out.println("Tipo de moeda inválido!");
                return;
        }

        cofrinho.adicionar(moeda);
    }

    private static void removerMoeda(Scanner scanner, Cofrinho cofrinho) {
        System.out.print("Digite o tipo da moeda a ser removida (Dolar, Euro, Real): ");
        String tipo = scanner.nextLine().trim();

        System.out.print("Digite o valor da moeda a ser removida: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Limpa o scanner

        cofrinho.remover(tipo, valor);
    }


    private static void listarMoedas(Cofrinho cofrinho) {
        if (cofrinho.getListaMoedas().isEmpty()) {
            System.out.println("O cofrinho está vazio!");
        } else {
            cofrinho.listagemMoedas();
        }
    }


    private static void calcularTotalConvertido(Cofrinho cofrinho) {
        double total = cofrinho.totalConvertido();
        System.out.println("Total convertido para Real: R$" + total);
    }
}
