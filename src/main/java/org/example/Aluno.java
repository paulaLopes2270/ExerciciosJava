package org.example;

import java.util.ArrayList;

public class Aluno {
    public static void main(String[] args) {
       
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("Iniciar chamada");
        alunos.add("Aliny");
        alunos.add("Andrezza");
        alunos.add("Bianca");
        alunos.add("Breno");
        alunos.add("Caio");
        alunos.add("Davi");
        alunos.add("Kawan");
        alunos.add("Keila");

        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i));
        }
    }
}
