package ExerciciosAula.Ex03;

public class Carro {
    private String fabricante;
    private String modelo;

    // Método para atribuir valores aos atributos
    public void setDadosCarro(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    // Método para retornar os valores atribuídos
    public String getDadosCarro() {
        return this.fabricante + " " + this.modelo;
    }
}