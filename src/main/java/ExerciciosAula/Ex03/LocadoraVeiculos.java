package ExerciciosAula.Ex03;

public class LocadoraVeiculos {
    private Carro carro;

    public LocadoraVeiculos() {
        this.carro = new Carro();
    }

    // atribuir valores ao carro
    public void atribuirDadosCarro(String fabricante, String modelo) {
        this.carro.setDadosCarro(fabricante, modelo);
    }

    //  exibir os dados do carro
    public String exibirDadosCarro() {
        return this.carro.getDadosCarro();
    }
}
