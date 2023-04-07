public class Produto implements Prateleira{
    String nome;

    @Override
    public void abastecer() {
        System.out.println("O produro " + nome + " Foi abastecido!");
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    
}
