package ListaExercicios.Escolar;

import java.util.ArrayList;

public class Turma {

private String nome;
private int codigo;
private ArrayList<Aluno> alunos;

    public Turma(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return nome + " - " + codigo;
    }

    public void add(Aluno aluno1) {

    }
}
