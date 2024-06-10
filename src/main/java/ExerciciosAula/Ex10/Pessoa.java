package ExerciciosAula.Ex10;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String telefone;

    public Pessoa(String nome, int idade, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Telefone: " + telefone;
    }
}
