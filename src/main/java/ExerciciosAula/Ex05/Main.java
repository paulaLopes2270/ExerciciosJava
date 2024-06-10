package ExerciciosAula.Ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o construtor para criar uma pessoa:");
        System.out.println("1. Nome e Idade");
        System.out.println("2. Apenas Idade");
        System.out.print("Digite sua escolha (1 ou 2): ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer após ler um número

        switch (escolha) {
            case 1:
                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();
                System.out.print("Digite a idade: ");
                int idade = scanner.nextInt();
                new Pessoa(nome, idade);
                break;
            case 2:
                System.out.print("Digite apenas a idade: ");
                idade = scanner.nextInt();
                new Pessoa(idade);
                break;
            default:
                System.out.println("Escolha inválida!");
                break;
        }

        scanner.close();
    }
}
