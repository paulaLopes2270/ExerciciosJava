package ExerciciosAula.Ex13;


public class Pessoal extends Compromisso implements ExibeCompromisso {
    // Construtor e métodos
    public Pessoal(String nome, String data, String hora) {
        super(nome, data, hora);
    }

    @Override
    public void exibeCompromisso() {
        System.out.println("Compromisso Pessoal: " + nome + " em " + data + " às " + hora);
    }
}
