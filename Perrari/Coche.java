package Perrari;

import java.util.Arrays;

public class Coche {

    Motor motor;
    Chasis chasis;
    Llanta[] llantas;
    Carroceria carroceria;

    public Motor creaMotor(int volumen) {
        return new Motor(volumen);
    }

    public Chasis creaChasis(tipoChasis tipo) {
        return new Chasis(tipo);
    }

    public Carroceria creaCarroceria(tipoCarroceria tipo, String color) {
        return new Carroceria(tipo, color);
    }

    public Llanta creaLlanta(String marca, int diametro, int altura, int anchura) {
        Llanta[] llantas = new Llanta[4];
        for (int i = 0; i < llantas.length; i++) {
            llantas[i] = new Llanta(marca, diametro, altura, anchura);
        }

        return llantas[0];
    }

    public Coche(Motor motor, Chasis chasis, Llanta[] llantas, Carroceria carroceria) {
        this.motor = motor;
        this.chasis = chasis;
        this.llantas = llantas;
        this.carroceria = carroceria;
    }

    Coche(Motor motor, Chasis chasis, Llanta[] llantas, Carroceria carroceria,
            String marca, int diametro, int altura, int anchura, String color, tipoCarroceria claseCarroceria) {
        this.motor = motor;
        this.chasis = chasis;
        llantas = new Llanta[4];
        for (int i = 0; i < llantas.length; i++) {
            llantas[i] = new Llanta(marca, diametro, altura, anchura);
        }
        carroceria = new Carroceria(claseCarroceria, color);
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }

    public Carroceria getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
    }

    void imprimir() {
        System.out.println("Datos del coche:");
        System.out.println("Motor - cilindros " + motor.getVolumen());
        System.out.println("Chasis - tipo " + chasis.getTipo());
        System.out.println("Carroceria - tipo " + carroceria.getTipo() + " color " + carroceria.getColor());

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((motor == null) ? 0 : motor.hashCode());
        result = prime * result + ((chasis == null) ? 0 : chasis.hashCode());
        result = prime * result + Arrays.hashCode(llantas);
        result = prime * result + ((carroceria == null) ? 0 : carroceria.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Coche other = (Coche) obj;
        if (motor == null) {
            if (other.motor != null)
                return false;
        } else if (!motor.equals(other.motor))
            return false;
        if (chasis == null) {
            if (other.chasis != null)
                return false;
        } else if (!chasis.equals(other.chasis))
            return false;
        if (!Arrays.equals(llantas, other.llantas))
            return false;
        if (carroceria == null) {
            if (other.carroceria != null)
                return false;
        } else if (!carroceria.equals(other.carroceria))
            return false;
        return true;
    }

}
