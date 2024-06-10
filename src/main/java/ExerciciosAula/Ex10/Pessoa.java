package ExerciciosAula.Ex10;

public class Pessoa {
    private String nome;
    private String rg;

    public Pessoa(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public void apresentarDados() {
        System.out.println("Nome: " + nome + ", RG: " + rg);
    }
}
