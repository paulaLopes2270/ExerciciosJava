package ExerciciosAula.Ex13;

public class Adicao extends Operacao {
    public Adicao(double a, double b) {
        super(a, b);
    }

    @Override
    public double calcular() {
        return a + b;
    }
}