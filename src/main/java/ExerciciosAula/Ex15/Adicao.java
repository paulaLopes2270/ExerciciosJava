package ExerciciosAula.Ex15;

public class Adicao extends Operacao {
    public Adicao(double a, double b) throws ExcecaoOperandosZero {
        super(a, b);
    }

    @Override
    public double calcular() {
        return a + b;
    }
}

