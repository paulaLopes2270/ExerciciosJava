package Compras;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getSubTotal();
        }
        return total;
    }

    public void listarProdutos() {
        System.out.println("Nome Valor Unit Qtd Sub-total");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        System.out.printf("Total: R$ %.2f%n", calcularTotal());
    }
}
