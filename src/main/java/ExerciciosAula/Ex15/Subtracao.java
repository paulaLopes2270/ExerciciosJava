package ExerciciosAula.Ex15;

public class Subtracao extends Operacao {
    public Subtracao(double a, double b) throws ExcecaoOperandosZero {
        super(a, b);
    }

    @Override
    public double calcular() {
        return a - b;
    }
}
