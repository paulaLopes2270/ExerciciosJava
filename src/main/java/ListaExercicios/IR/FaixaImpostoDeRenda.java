package ListaExercicios.IR;

public class FaixaImpostoDeRenda {

    private static final double[] limites = {2112.00, 2826.66, 3751.06, 4664.68};
    private static final double[] aliquotas = {0, 0.075, 0.15, 0.225, 0.275};

    public static int getFaixa(double salario) {
        for (int i = 0; i < limites.length; i++) {
            if (salario <= limites[i]) {
                return i + 1;
            }
        }
        return limites.length + 1;
    }

    public static double calcularImposto(double salario) {
        double imposto = 0;
        double[] limites = {2112.00, 2826.66, 3751.06, 4664.68};
        double[] aliquotas = {0, 0.075, 0.15, 0.225, 0.275};
        double[] valores = {0, 714.66, 924.40, 913.62};

        for (int i = limites.length - 1; i >= 0; i--) {
            if (salario > limites[i]) {
                imposto += (salario - limites[i]) * aliquotas[i + 1];
                salario = limites[i];
            }
        }

        return imposto;
    }
}