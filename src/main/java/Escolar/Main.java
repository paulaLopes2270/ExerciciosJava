package Escolar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Criando a lista de alunos
        ArrayList<Aluno> lista = new ArrayList<>();

        // Criando e adicionando um aluno à lista
        Aluno aluno1 = new Aluno("Paula", 28, 1023203);
        lista.add(aluno1);

        // Imprimindo os detalhes dos alunos na lista
        for (Aluno a : lista) {
            System.out.println(a);
        }

        // Criando as turmas
        Turma turma1 = new Turma("Turma1", 102); // Corrigido o valor do código
        Turma turma2 = new Turma("Turma2", 103); // Corrigido o valor do código

        // Adicionando alunos às turmas
        turma1.addAluno(aluno1);

        // Criando e adicionando mais alunos
        Aluno aluno2 = new Aluno("Lucas", 22, 1023204);
        Aluno aluno3 = new Aluno("Maria", 23, 1023205);
        turma2.addAluno(aluno2);
        turma2.addAluno(aluno3);

        // Listando alunos de cada turma
        System.out.println("Alunos na " + turma1.getNome() + ":");
        for (Aluno a : turma1.getAlunos()) {
            System.out.println(a);
        }

        System.out.println("Alunos na " + turma2.getNome() + ":");
        for (Aluno a : turma2.getAlunos()) {
            System.out.println(a);
        }
    }
}
