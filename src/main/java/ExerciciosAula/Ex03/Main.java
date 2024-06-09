package ExerciciosAula.Ex03;

public class Main {
    public static void main(String[] args) {
        LocadoraVeiculos locadora = new LocadoraVeiculos();
        locadora.atribuirDadosCarro("VW", "Gol");
        System.out.println("Dados do carro: " + locadora.exibirDadosCarro());
    }
}