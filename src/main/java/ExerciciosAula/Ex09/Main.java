package ExerciciosAula.Ex09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de animal:");
        String tipo = scanner.nextLine();

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        Pessoa pessoa = new Pessoa(tipo, nome, idade);
        System.out.println("Tipo: " + pessoa.tipo);
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);

        pessoa.andar();
        System.out.println(pessoa.falar());

        scanner.close();
    }
}
