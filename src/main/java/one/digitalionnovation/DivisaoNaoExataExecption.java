package one.digitalionnovation;

public class DivisaoNaoExataExecption extends Exception {

    private int numerado;
    private int denominador;

    public DivisaoNaoExataExecption(String message, int numerado, int denominador) {
        super(message);
        this.numerado = numerado;
        this.denominador = denominador;
    }




}
