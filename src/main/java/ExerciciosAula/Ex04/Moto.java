package ExerciciosAula.Ex04;

public class Moto {
    private String marca;
    private String modelo;
    private int cilindradas;

    // Método para atribuir valores aos atributos
    public void setDados(String marca, String modelo, int cilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindradas = cilindradas;
    }

    // Método para retornar os valores atribuídos
    public String getDados() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Cilindradas: " + cilindradas + "cc";
    }
}
