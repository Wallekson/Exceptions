package one.digitalionnovation;

public class DivisaoporZero extends ArithmeticException {

    private int numerador;
    private int denominador;

    public DivisaoporZero(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
