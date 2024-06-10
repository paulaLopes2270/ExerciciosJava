package ExerciciosAula.Ex12;

public class Profissional extends Compromisso implements ExibeCompromisso {
    public Profissional(String nome, String data, String hora) {
        super(nome, data, hora);
    }

    @Override
    public void exibeCompromisso() {
        System.out.println("Compromisso Profissional: " + nome + " em " + data + " às " + hora);
    }
}

