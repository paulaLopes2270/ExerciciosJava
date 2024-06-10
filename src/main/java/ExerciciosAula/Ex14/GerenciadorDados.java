package ExerciciosAula.Ex14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GerenciadorDados {
    // Método para gravar nome e email
    public void saveData(String username, String email) {
        String filename = username + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Nome: " + username);
            writer.newLine();
            writer.write("Email: " + email);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    // Método sobrecarregado para gravar apenas o nome
    public void saveData(String username) {
        String filename = username + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Nome: " + username);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
