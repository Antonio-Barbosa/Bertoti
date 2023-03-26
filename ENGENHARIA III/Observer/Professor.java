
     public class Professor implements Observer {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " foi notificado: " + message);
    }
}

