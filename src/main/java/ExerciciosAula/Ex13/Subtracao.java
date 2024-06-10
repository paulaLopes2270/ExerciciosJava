package ExerciciosAula.Ex13;

public class Subtracao extends Operacao {
    public Subtracao(double a, double b) {
        super(a, b);
    }

    @Override
    public double calcular() {
        return a - b;
    }
}
