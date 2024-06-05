package Biblioteca;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> livros = new ArrayList<>();


        livros.add("1984 - George Orwell - 1949");
        livros.add("To Kill a Mockingbird - Harper Lee - 1960");
        livros.add("The Great Gatsby - F. Scott Fitzgerald - 1925");


        for(int i = 0; i < livros.size(); i++) {
            System.out.println(livros.get(i));
        }


        int index = livros.indexOf("The Great Gatsby - F. Scott Fitzgerald - 1925");
        System.out.println("O índice do livro 'The Great Gatsby - F. Scott Fitzgerald - 1925' é: " + index);
    }
}
