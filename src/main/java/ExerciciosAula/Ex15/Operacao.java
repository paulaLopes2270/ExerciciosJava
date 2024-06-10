package ExerciciosAula.Ex15;

public abstract class Operacao {
    protected double a;
    protected double b;

    public Operacao(double a, double b) throws ExcecaoOperandosZero {
        if (a == 0 && b == 0) {
            throw new ExcecaoOperandosZero("Ambos os valores a serem calculados devem ser diferentes de 0");
        }
        this.a = a;
        this.b = b;
    }

    public abstract double calcular();
}
