package ExerciciosAula.Ex11;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Carlos", "123456789");
        Aluno aluno = new Aluno("Maria", "987654321", "A123456");
        Professor professor = new Professor("João", "456789123", "P654321", 5000.00);

        System.out.println("Dados da Pessoa:");
        pessoa.apresentarDados();
        System.out.println();

        System.out.println("Dados do Aluno:");
        aluno.apresentarDados();
        System.out.println();

        System.out.println("Dados do Professor:");
        professor.apresentarDados();
    }
}
