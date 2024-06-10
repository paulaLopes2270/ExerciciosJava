package ExerciciosAula.Ex14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDados manager = new GerenciadorDados();

        System.out.println("Digite o nome do usuário:");
        String name = scanner.nextLine();

        System.out.println("Deseja salvar o email também? (s/n)");
        String response = scanner.nextLine().toLowerCase();

        if (response.equals("s")) {
            System.out.println("Digite o email do usuário:");
            String email = scanner.nextLine();
            manager.saveData(name, email);
        } else {
            manager.saveData(name);
        }

        System.out.println("Deseja ler os dados de um usuário? (s/n)");
        response = scanner.nextLine().toLowerCase();

        if (response.equals("s")) {
            System.out.println("Digite o nome do usuário para ler os dados:");
            String readName = scanner.nextLine();
            readUserData(readName);
        }

        scanner.close();
    }

    // Método para ler os dados do arquivo
    private static void readUserData(String username) {
        String filename = username + ".txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}

