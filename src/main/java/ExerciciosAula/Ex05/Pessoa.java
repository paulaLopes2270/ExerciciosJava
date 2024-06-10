package ExerciciosAula.Ex05;


public class Pessoa {
    private String nome;
    private int idade;

    // Construtor que recebe nome e idade
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("Criada uma nova pessoa com nome: " + nome + " e idade: " + idade);
    }

    // Construtor que recebe apenas a idade
    public Pessoa(int idade) {
        this.nome = "Não fornecido";
        this.idade = idade;
        System.out.println("Criada uma nova pessoa com idade: " + idade + " (nome não fornecido)");
    }
}