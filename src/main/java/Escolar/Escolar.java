package Escolar;

import java.util.ArrayList;

public class Escolar {
        public static void main(String[] args) {

            ArrayList<Aluno> lista = new ArrayList<>();

            Aluno aluno = new Aluno("Paula", 28, 1023203);
            lista.add(aluno);


            for (Aluno a : lista) {
                System.out.println(a);
            }
        }
    }