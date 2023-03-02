public class Calculadora {
    Calculo calculo;

    public void setCalcula(Calculo cal){
        calculo = cal;
    }

    public void realizaCalculo(int x, int y){
        calculo.calculoOperacao(x,y);
    }

}
