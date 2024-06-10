package ExerciciosAula.Ex10;

public class Professor extends Pessoa {
    private String matricula;
    private double salario;

    public Professor(String nome, String rg, String matricula, double salario) {
        super(nome, rg); // Passa nome e rg para o construtor da superclasse Pessoa
        this.matricula = matricula;
        this.salario = salario;
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados(); // Chama o método da superclasse
        System.out.println("Matrícula: " + matricula + ", Salário: " + salario);
    }
}
