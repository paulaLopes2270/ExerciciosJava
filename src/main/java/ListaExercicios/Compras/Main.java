package ListaExercicios.Compras;

public class Main {
    public static void main(String[] args) {
        // Criando produtos
        Produto produto1 = new Produto("Mouse Gamer", 60.00, 2);
        Produto produto2 = new Produto("Teclado Mecânico", 150.00, 1);
        Produto produto3 = new Produto("Monitor 24\"", 900.00, 1);

        // Criando carrinho de compras e adicionando produtos
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        // Listando produtos no carrinho
        carrinho.listarProdutos();
    }
}
