package ExerciciosAula.Ex13;

public class Multiplicacao extends Operacao {
    public Multiplicacao(double a, double b) {
        super(a, b);
    }

    @Override
    public double calcular() {
        return a * b;
    }
}
