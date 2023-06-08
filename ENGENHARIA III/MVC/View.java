import java.util.List;

public class View {
    private Promocao promocao;
    private List<Produto> produtos;

    public View(Promocao promocao, List<Produto> produtos){
        this.promocao = promocao;
        this.produtos = produtos;
    }
    
    public void setPromo(Promocao p){
        p = promocao;
    }

    public void update(List<Produto> l){
        l = produtos;
    }
}
