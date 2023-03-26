public class Main {
    public static void main(String[] args) {
        Escola school = new Escola();

        Professor professor1 = new Professor("Professor João");
        Professor professor2 = new Professor("Professor José");

        Estudante estudante1 = new Estudante("Maria");
        Estudante estudante2 = new Estudante("Pedro");

        school.addObserver(professor1);
        school.addObserver(professor2);
        school.addObserver(estudante1);
        school.addObserver(estudante2);

        school.notifyObservers("Foi adicionado um novo professor e um novo aluno na escola.");
    }
}
