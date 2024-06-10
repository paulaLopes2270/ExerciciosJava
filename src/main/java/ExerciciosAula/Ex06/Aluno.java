package ExerciciosAula.Ex06;

public class Aluno {
    private String nome;
    private String matricula;
    private String dataNascimento;
    private int anoIngresso;

    // Construtor que recebe nome e matrícula
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        System.out.println("Aluno criado com nome: " + nome + " e matrícula: " + matricula);
    }

    // Construtor que recebe apenas a data de nascimento
    public Aluno(String dataNascimento) {
        this.dataNascimento = dataNascimento;
        System.out.println("Aluno criado com data de nascimento: " + dataNascimento);
    }

    // Construtor que recebe o nome, a data de nascimento e o ano de ingresso
    public Aluno(String nome, String dataNascimento, int anoIngresso) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoIngresso = anoIngresso;
        System.out.println("Aluno criado com nome: " + nome + ", data de nascimento: " + dataNascimento + " e ano de ingresso: " + anoIngresso);
    }
}
