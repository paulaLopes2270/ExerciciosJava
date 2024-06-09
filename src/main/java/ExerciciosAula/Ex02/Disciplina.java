package ExerciciosAula.Ex02;

public class Disciplina {
    public static void main(String[] args) {
        // Instanciando a classe Professor e definindo o nome
        Professor professor = new Professor("Lucas Schlestein");

        // Instanciando a classe Laboratorio e definindo o local
        Laboratorio laboratorio = new Laboratorio("Sala 2");

        // Exibindo os valores dos atributos
        System.out.println("O nome do professor é: " + professor.nome);
        System.out.println("O local da aula é: " + laboratorio.local);
    }
}