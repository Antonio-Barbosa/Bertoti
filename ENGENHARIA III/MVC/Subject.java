import java.util.List;

public interface Subject {
    public void registerObserver(Observer o);
    public void notifyObservers(List<Produto> l);
}
