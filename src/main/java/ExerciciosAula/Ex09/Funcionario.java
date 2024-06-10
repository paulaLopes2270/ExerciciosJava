package ExerciciosAula.Ex09;

public class Funcionario extends Pessoa {
    private String setor;
    private String cargo;
    private String funcao;

    public Funcionario(String nome, int idade, String telefone, String setor, String cargo, String funcao) {
        super(nome, idade, telefone);
        this.setor = setor;
        this.cargo = cargo;
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Setor: " + setor + ", Cargo: " + cargo + ", Função: " + funcao;
    }
}
