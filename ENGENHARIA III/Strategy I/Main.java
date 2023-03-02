public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.setCalcula(new Divisao());
        calc.realizaCalculo();

        Calculadora calc1 = new Calculadora();
        calc1.setCalcula(new Adicao());
        calc1.realizaCalculo();
       

        Calculadora calc2 = new Calculadora();
        calc2.setCalcula(new Subtracao());
        calc2.realizaCalculo();

        Calculadora calc3 = new Calculadora();
        calc3.setCalcula(new Multiplicacao());
        calc3.realizaCalculo();
    }
}
