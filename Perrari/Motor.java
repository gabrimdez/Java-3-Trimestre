package Perrari;

public class Motor {

    int volumen;

    Motor(int volumen) {
        this.volumen = volumen;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "volumen=" + volumen +
                '}';
    }

}
