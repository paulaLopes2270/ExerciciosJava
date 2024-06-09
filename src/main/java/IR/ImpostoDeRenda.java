package IR;

public class ImpostoDeRenda {
    private Pessoa pessoa;

    public ImpostoDeRenda(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double calcular() {
        double salario = pessoa.getSalario();
        double imposto = 0;

        if (salario <= 2112.00) {
            imposto = 0;
        } else if (salario <= 2826.66) {
            imposto = (salario - 2112.00) * 0.075;
        } else if (salario <= 3751.06) {
            imposto = (2826.66 - 2112.00) * 0.075;
            imposto += (salario - 2826.66) * 0.15;
        } else if (salario <= 4664.68) {
            imposto = (2826.66 - 2112.00) * 0.075;
            imposto += (3751.06 - 2826.66) * 0.15;
            imposto += (salario - 3751.06) * 0.225;
        } else {
            imposto = (2826.66 - 2112.00) * 0.075;
            imposto += (3751.06 - 2826.66) * 0.15;
            imposto += (4664.68 - 3751.06) * 0.225;
            imposto += (salario - 4664.68) * 0.275;
        }

        return imposto;
    }

    public void imprimir() {
        double imposto = calcular();
        int faixa = FaixaImpostoDeRenda.getFaixa(pessoa.getSalario());
        System.out.printf("%s seu salário é R$ %.2f, sua faixa de imposto é %d e o valor do imposto de renda a ser pago é: R$ %.2f%n",
                pessoa.getNome(), pessoa.getSalario(), faixa, imposto);
    }
}
