package ListaExercicios.IR;

public class ImpostoDeRenda {
    private Pessoa pessoa;

    public ImpostoDeRenda(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double calcular() {
        return FaixaImpostoDeRenda.calcularImposto(pessoa.getSalario());
    }

    public void imprimir() {
        double imposto = calcular();
        int faixa = FaixaImpostoDeRenda.getFaixa(pessoa.getSalario());
        System.out.printf("%s seu salário é R$ %.2f, sua faixa de imposto é %d e o valor do imposto de renda a ser pago é: R$ %.2f%n",
                pessoa.getNome(), pessoa.getSalario(), faixa, imposto);
    }
}
