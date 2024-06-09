package ListaExercicios.HealthCare;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias da classe Paciente
        Paciente paciente1 = new Paciente(70, 1.75);
        paciente1.setNome("Lucas");

        Paciente paciente2 = new Paciente(85, 1.80);
        paciente2.setNome("Mariana");

        Paciente paciente3 = new Paciente(95, 1.60);
        paciente3.setNome("Carlos");

        // Imprimindo os resultados
        System.out.println(paciente1);
        System.out.println(paciente2);
        System.out.println(paciente3);
    }
}

