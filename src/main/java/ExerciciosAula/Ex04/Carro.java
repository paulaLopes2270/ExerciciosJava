package ExerciciosAula.Ex04;

public class Carro {
    private String fabricante;
    private String modelo;

    public void setDadosCarro(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public String getDadosCarro() {
        return "Fabricante: " + fabricante + ", Modelo: " + modelo;
    }
}
