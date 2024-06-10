package ExerciciosAula.Ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do funcionário " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade do funcionário " + (i + 1) + ":");
            int idade = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer do scanner

            System.out.println("Digite o telefone do funcionário " + (i + 1) + ":");
            String telefone = scanner.nextLine();

            System.out.println("Digite o setor do funcionário " + (i + 1) + ":");
            String setor = scanner.nextLine();

            System.out.println("Digite o cargo do funcionário " + (i + 1) + ":");
            String cargo = scanner.nextLine();

            System.out.println("Digite a função do funcionário " + (i + 1) + ":");
            String funcao = scanner.nextLine();

            funcionarios[i] = new Funcionario(nome, idade, telefone, setor, cargo, funcao);
        }

        System.out.println("\nFuncionários Cadastrados:");
        for (Funcionario func : funcionarios) {
            System.out.println(func);
        }

        scanner.close();
    }
}

