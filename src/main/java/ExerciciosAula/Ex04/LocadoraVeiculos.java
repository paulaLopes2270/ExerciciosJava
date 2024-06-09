package ExerciciosAula.Ex04;

import java.util.Scanner;

public class LocadoraVeiculos {
    private Carro carro;
    private Moto moto1;
    private Moto moto2;

    Scanner scanner = new Scanner(System.in);

    public void criarVeiculos() {
        System.out.println("Digite a marca, modelo e cilindradas da primeira moto:");
        moto1 = new Moto();
        moto1.setDados(scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Digite a marca, modelo e cilindradas da segunda moto:");
        moto2 = new Moto();
        moto2.setDados(scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Digite a fabricante e modelo do carro:");
        carro = new Carro();
        carro.setDadosCarro(scanner.nextLine(), scanner.nextLine());
    }

    public void exibirDadosVeiculos() {
        System.out.println("Dados da primeira moto: " + moto1.getDados());
        System.out.println("Dados da segunda moto: " + moto2.getDados());
        System.out.println("Dados do carro: " + carro.getDadosCarro());
    }
}
