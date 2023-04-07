public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Vitamina");
        Produto produto1 = new Produto();
        produto1.setNome("Pomada");
        Produto produto2 = new Produto();
        produto2.setNome("Pilula");
        Produto produto3 = new Produto();
        produto3.setNome("Creme");
        Abastece abastece = new Abastece();
        abastece.add(produto);
        abastece.add(produto1);
        abastece.add(produto2);
        abastece.add(produto3);
        abastece.abastecer();

    }
}
