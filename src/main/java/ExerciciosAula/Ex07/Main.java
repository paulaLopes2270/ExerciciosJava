package ExerciciosAula.Ex07;

import java.util.Scanner;

public class Main extends Usuario {

    public Main(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu email:");
        String email = scanner.nextLine();

        System.out.println("Digite seu telefone:");
        String telefone = scanner.nextLine();

        Main principal = new Main(nome, email, telefone);
        principal.imprimirInformacoes();

        scanner.close();
    }
}
