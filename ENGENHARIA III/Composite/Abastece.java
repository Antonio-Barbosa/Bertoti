import java.util.LinkedList;

public class Abastece implements Prateleira{
    LinkedList<Prateleira> prateleira = new LinkedList<>();

    @Override
    public void abastecer() {
       prateleira.forEach(prat -> prat.abastecer());
    }
    public void add(Prateleira prod){
        prateleira.add(prod);
    }
}
