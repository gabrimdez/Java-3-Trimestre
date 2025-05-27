package Aritmetica;

public class Fraccion extends Numero {

    private Numero numerador;
    private Numero denominador;

    public Fraccion(int num, Numero numerador, Numero denominador) {
        super(num);
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Numero getNumerador() {
        return numerador;
    }

    public void setNumerador(Numero numerador) {
        this.numerador = numerador;
    }

    public Numero getDenominador() {
        return denominador;
    }

    public void setDenominador(Numero denominador) {
        this.denominador = denominador;
    }

}
