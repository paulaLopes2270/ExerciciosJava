package ExerciciosAula.Ex10;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String rg, String matricula) {
        super(nome, rg); // Passa nome e rg para o construtor da superclasse Pessoa
        this.matricula = matricula;
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados(); // Chama o método da superclasse
        System.out.println("Matrícula: " + matricula);
    }
}

