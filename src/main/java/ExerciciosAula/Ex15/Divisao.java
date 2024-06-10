package ExerciciosAula.Ex15;

public class Divisao extends Operacao {
    public Divisao(double a, double b) throws ExcecaoOperandosZero {
        super(a, b);
    }

    @Override
    public double calcular() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return Double.NaN;
        }
    }
}
