package ExerciciosAula.Ex15;

public class Multiplicacao extends Operacao {
    public Multiplicacao(double a, double b) throws ExcecaoOperandosZero {
        super(a, b);
    }

    @Override
    public double calcular() {
        return a * b;
    }
}
