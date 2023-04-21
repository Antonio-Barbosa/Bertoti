import java.util.LinkedList;

public class Singleton {

    private static Singleton escola;

    public LinkedList<String> Professores = new LinkedList<>();

    private Singleton(String value) {
        Professores.add(value);
    }

    public static Singleton getInstance(String professor) {

        if (escola == null) {
            escola = new Singleton(professor);
        }

        return escola;
    }

    public void addProfessor(String profesor){
        Professores.add(profesor);
    }
}
