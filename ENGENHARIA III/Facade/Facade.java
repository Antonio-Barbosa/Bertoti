public class Facade {
    private Prateleira produto;

    public Facade(Prateleira produto) {
        this.produto = produto;
    }

    public void adicionarProduto(String prod, int preco) {
        produto.adicionarProd(prod);
        produto.precificar(prod, preco);
        produto.verificarValidade(prod);
    }

}
