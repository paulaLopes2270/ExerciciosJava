package ExerciciosAula.Ex13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        // Instanciando as operações
        Operacao add = new Adicao(num1, num2);
        Operacao sub = new Subtracao(num1, num2);
        Operacao mul = new Multiplicacao(num1, num2);
        Operacao div = new Divisao(num1, num2);

        // Calculando e exibindo os resultados
        System.out.println("Resultado da Adição: " + add.calcular());
        System.out.println("Resultado da Subtração: " + sub.calcular());
        System.out.println("Resultado da Multiplicação: " + mul.calcular());
        System.out.println("Resultado da Divisão: " + div.calcular());

        scanner.close();
    }
}
