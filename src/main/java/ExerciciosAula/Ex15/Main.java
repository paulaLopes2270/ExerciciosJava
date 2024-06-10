package ExerciciosAula.Ex15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Digite o primeiro número:");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número:");
                num2 = scanner.nextDouble();

                Operacao[] operacoes = {
                        new Adicao(num1, num2),
                        new Subtracao(num1, num2),
                        new Multiplicacao(num1, num2),
                        new Divisao(num1, num2)
                };

                for (Operacao op : operacoes) {
                    System.out.println("Resultado: " + op.calcular());
                }
                entradaValida = true;
            } catch (ExcecaoOperandosZero e) {
                System.out.println(e.getMessage());
                System.out.println("Por favor, insira novamente os números.");
            }
        }

        scanner.close();
    }
}

