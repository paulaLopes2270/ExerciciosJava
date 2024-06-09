package ExerciciosAula.Ex01;

public class Pessoa {
    private String nome;
    private double salario;
    private int idade;  // Adicionando o atributo idade

    public Pessoa(String nome, double salario, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }
}