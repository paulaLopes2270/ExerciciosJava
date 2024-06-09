package ExerciciosAula.Ex01;

public class Main {
    public static void main(String[] args) {
        // três objetos do tipo Pessoa
        Pessoa pessoa1 = new Pessoa("Alice", 3000.00, 25);
        Pessoa pessoa2 = new Pessoa("Bob", 4000.00, 30);
        Pessoa pessoa3 = new Pessoa("Carol", 5000.00, 35);

        // Exibindo a idade das três pessoas
        System.out.println("Idade da pessoa 1: " + pessoa1.getIdade());
        System.out.println("Idade da pessoa 2: " + pessoa2.getIdade());
        System.out.println("Idade da pessoa 3: " + pessoa3.getIdade());
    }
}