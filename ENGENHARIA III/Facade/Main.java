
public class Main {
    public static void main(String[] args) {

        String[] produtos = { "Arroz", "Feijão", "Farinha", "Caneta" };
        int[] precos = { 10, 25, 20, 17 };

        Prateleira produto = new Prateleira();
        Facade facade = new Facade(produto);

        for (int i = 0; i <= produtos.length; i++) {
            facade.adicionarProduto(produtos[i], precos[i]);
            System.out.println("------------------------------------------------------------------------");
        }

    }
}